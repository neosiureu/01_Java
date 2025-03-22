package com.example.pdftable;

import java.io.*;
import java.util.*;
import java.util.regex.*;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import technology.tabula.*;
import technology.tabula.extractors.SpreadsheetExtractionAlgorithm;

public class OnlyTitle {
    public static void main(String[] args) {
        String pdfPath = "C:/pdf/sample.pdf";
        String outputCsvPath = "C:/pdf/output/onlyTitleFullName.csv";

        PDDocument document = null;
        try {
            File pdfFile = new File(pdfPath);
            document = PDDocument.load(pdfFile);

            // [A] PDFTextStripper로 code + title 추출
            PDFTextStripper stripper = new PDFTextStripper();
            String fullText = stripper.getText(document);
            String[] lines = fullText.split("\\r?\\n");

            // INC, CIV, CEN, MEC, IRC 포함
            Pattern codeTitlePattern = Pattern.compile("^((ENE|INC|CIV|CEN|MEC|IRC)\\d{4})\\s+(.*)$");
            Map<String, String> codeTitleMap = new LinkedHashMap<>();

            for (String line : lines) {
                line = line.trim();
                if (line.isEmpty()) continue;
                Matcher matcher = codeTitlePattern.matcher(line);
                if (matcher.find()) {
                    String code = matcher.group(1);       // 전체 코드 (ex: ENE2022)
                    String title = matcher.group(3);      // 제목 부분
                    codeTitleMap.put(code, title);
                }
            }

            // [B] Tabula로 desc 추출
            ObjectExtractor extractor = new ObjectExtractor(document);
            PageIterator pages = extractor.extract();
            SpreadsheetExtractionAlgorithm sea = new SpreadsheetExtractionAlgorithm();
            Map<String, String[]> descMap = new HashMap<>();

            while (pages.hasNext()) {
                Page page = pages.next();
                List<Table> tables = sea.extract(page);
                for (Table table : tables) {
                    for (List<RectangularTextContainer> row : table.getRows()) {
                        if (row.size() >= 4) {
                            String codeCell = cleanText(row.get(0).getText());
                            if (codeCell.matches("^(ENE|INC|CIV|CEN|MEC|IRC)\\d{4}$")) {
                                String descKr = cleanText(row.get(2).getText());
                                String descEn = cleanText(row.get(3).getText());
                                descMap.put(codeCell, new String[] { descKr, descEn });
                            }
                        }
                    }
                }
            }

            // [C] 병합 후 저장
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(outputCsvPath), "UTF-8"));
            writer.write('\uFEFF');
            writer.println("code,titleFullName,desc_kr,desc_en");

            for (Map.Entry<String, String> entry : codeTitleMap.entrySet()) {
                String code = entry.getKey();
                String title = entry.getValue();
                String[] descs = descMap.getOrDefault(code, new String[] {"", ""});
                writer.printf("%s,%s,%s,%s\n", code, title, descs[0], descs[1]);
            }

            writer.close();
            System.out.println("✅ onlyTitleFullName.csv 저장 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (document != null) {
                try { document.close(); } catch (IOException e) { e.printStackTrace(); }
            }
        }
    }

    private static String cleanText(String text) {
        return text.replaceAll("[\\r\\n]+", " ")
                   .replace(",", "")
                   .trim();
    }
}
