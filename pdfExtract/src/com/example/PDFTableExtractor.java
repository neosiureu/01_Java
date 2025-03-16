import java.io.File;
import java.util.List;
import technology.tabula.*;
import technology.tabula.extractors.SpreadsheetExtractionAlgorithm;

public class PDFTableExtractor {
    public static void main(String[] args) {
        String pdfPath = "C:/pdf/sample.pdf"; // PDF 파일 경로

        try {
            // PDF 파일 로드
            File pdfFile = new File(pdfPath);
            ObjectExtractor extractor = new ObjectExtractor(PDDocument.load(pdfFile));
            SpreadsheetExtractionAlgorithm sea = new SpreadsheetExtractionAlgorithm();
            PageIterator pages = extractor.extract();

            int tableIndex = 1;
            while (pages.hasNext()) {
                Page page = pages.next();
                List<Table> tables = sea.extract(page);

                // 🔹 표만 추출
                for (Table table : tables) {
                    System.out.println("📌 표 #" + tableIndex + " 추출 결과:");
                    for (List<RectangularTextContainer> row : table.getRows()) {
                        for (RectangularTextContainer cell : row) {
                            System.out.print(cell.getText() + " | ");
                        }
                        System.out.println();
                    }
                    tableIndex++;
                    System.out.println("------------------------------------------------");
                }
            }

            System.out.println("✅ PDF 표 데이터 추출 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
