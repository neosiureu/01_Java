package com.example.pdftable;  // ✅ 패키지명 추가

import java.io.File;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import technology.tabula.*;
import technology.tabula.extractors.SpreadsheetExtractionAlgorithm;

public class PDFTableExtractor {
    public static void main(String[] args) {
        String pdfPath = "C:/pdf/sample.pdf"; // 📌 PDF 파일 경로

        try {
            // ✅ PDF 파일 로드
            File pdfFile = new File(pdfPath);
            PDDocument document = PDDocument.load(pdfFile);

            // ✅ Tabula 객체 생성
            ObjectExtractor extractor = new ObjectExtractor(document);
            SpreadsheetExtractionAlgorithm sea = new SpreadsheetExtractionAlgorithm();
            PageIterator pages = extractor.extract(); // 페이지 추출

            int tableIndex = 1;
            while (pages.hasNext()) {  // ✅ 모든 페이지 반복
                Page page = pages.next();
                List<Table> tables = sea.extract(page);
             // ✅ 표 데이터 출력 (빈 셀 제거 + 가독성 개선)
                for (Table table : tables) {
                    System.out.println("📌 표 #" + tableIndex + " 추출 결과:");

                    for (List<RectangularTextContainer> row : table.getRows()) {
                        StringBuilder rowData = new StringBuilder();  // 🔹 한 행(Row)의 데이터를 저장할 StringBuilder

                        for (RectangularTextContainer cell : row) {
                            String cellText = cell.getText().trim().replace("\n", " "); // 🔹 줄바꿈 제거 + 공백 정리
                            if (!cellText.isEmpty()) {  // 🔹 빈 셀은 제외
                                rowData.append(cellText).append(" | ");
                            }
                        }

                        if (!rowData.toString().isEmpty()) {  // 🔹 실제 데이터가 있는 경우만 출력
                            System.out.println(rowData.toString());
                        }
                    }
                    tableIndex++;
                    System.out.println("------------------------------------------------");
                }
            }

            document.close(); // ✅ 문서 닫기
            System.out.println("✅ PDF 표 데이터 추출 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
