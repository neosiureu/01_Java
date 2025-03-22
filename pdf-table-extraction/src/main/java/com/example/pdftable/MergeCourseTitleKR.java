package com.example.pdftable;

import java.io.*;
import java.util.*;

public class MergeCourseTitleKR {
    public static void main(String[] args) {
        String tablePath = "C:/pdf/output/merged_tables_non_title_fixed.csv";
        String titlePath = "C:/pdf/output/onlyTitleFullName.csv";
        String outputPath = "C:/pdf/output/merged_final.csv";

        try {
            // [1] titleFullName 파일 읽기
            Map<String, String> codeToTitleFullMap = new HashMap<>();
            BufferedReader titleReader = new BufferedReader(new InputStreamReader(
                new FileInputStream(titlePath), "UTF-8"));
            titleReader.readLine(); // 헤더 스킵
            String line;
            while ((line = titleReader.readLine()) != null) {
                String[] parts = line.split(",", 2); // code, titleFull
                if (parts.length == 2) {
                    codeToTitleFullMap.put(parts[0].trim(), parts[1].trim());
                }
            }
            titleReader.close();

            // [2] 기존 추출 파일 읽기 및 병합
            BufferedReader tableReader = new BufferedReader(new InputStreamReader(
                new FileInputStream(tablePath), "UTF-8"));
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(outputPath), "UTF-8"));
            writer.write('\uFEFF');
            writer.println("code,title_en,desc_kr,desc_en,titleFullName");

            tableReader.readLine(); // 헤더 스킵
            while ((line = tableReader.readLine()) != null) {
                String[] cols = line.split(",", 4); // code, title_en, desc_kr, desc_en
                if (cols.length < 4) continue;

                String code = cols[0].trim();
                String titleEn = cols[1].trim();
                String descKr = cols[2].trim();
                String descEn = cols[3].trim();
                String titleFull = codeToTitleFullMap.getOrDefault(code, "");

                writer.printf("\"%s\",\"%s\",\"%s\",\"%s\",\"%s\"\n",
                    code, titleEn, descKr, descEn, titleFull);
            }

            tableReader.close();
            writer.close();
            System.out.println("✅ merged_final.csv 파일 병합 완료!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
