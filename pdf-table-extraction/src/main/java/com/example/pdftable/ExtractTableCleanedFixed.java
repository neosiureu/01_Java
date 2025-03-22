package com.example.pdftable;

import java.io.*;
import java.util.*;
import org.apache.pdfbox.pdmodel.PDDocument;
import technology.tabula.*;
import technology.tabula.extractors.SpreadsheetExtractionAlgorithm;

public class ExtractTableCleanedFixed {
    public static void main(String[] args) {
        String pdfPath = "C:/pdf/sample.pdf";
        String outputCsvPath = "C:/pdf/output/merged_tables_non_title_fixed.csv";

        try {
            File pdfFile = new File(pdfPath);
            PDDocument document = PDDocument.load(pdfFile);
            ObjectExtractor extractor = new ObjectExtractor(document);
            SpreadsheetExtractionAlgorithm sea = new SpreadsheetExtractionAlgorithm();
            PageIterator pages = extractor.extract();

            PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(outputCsvPath), "UTF-8"));
            writer.write('\uFEFF');
            writer.println("code,title,desc_kr,desc_en");

            List<String> buffer = new ArrayList<>();
            String codePattern = "^(ENE|INC|CIV|CEN|MEC|IRC)\\d{4}$";

            while (pages.hasNext()) {
                Page page = pages.next();
                List<Table> tables = sea.extract(page);

                for (List<RectangularTextContainer> row : tables.stream().flatMap(t -> t.getRows().stream()).toList()) {
                    for (RectangularTextContainer cell : row) {
                        String text = clean(cell.getText());

                        if (text.contains("교과목 해설") || text.contains("Course Catalog")) continue;
                        if (text.isEmpty()) continue;

                        // 코드가 새로 등장하면, buffer가 4개 이상이더라도 강제로 버리고 새로 시작
                        if (text.matches(codePattern)) {
                            buffer.clear(); // 무조건 버리고 시작
                        }

                        buffer.add(text);

                        if (buffer.size() == 4) {
                            writer.printf("%s,%s,%s,%s\n",
                                    buffer.get(0), buffer.get(1), buffer.get(2), buffer.get(3));
                            buffer.clear();
                        }
                    }
                }
            }

            writer.close();
            document.close();
            System.out.println("✅ code, title, desc_kr, desc_en 순서로 저장 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String clean(String text) {
        return text.replaceAll("[\\r\\n]+", " ")
                   .replace(",", "")
                   .trim();
    }
}
