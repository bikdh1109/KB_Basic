package lecture;

import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PharmacyReader {

    public static List<Pharmacy> readCsv(String filePath) {
        // list 생성
        List<Pharmacy> pharmacies = new ArrayList<>();

        // BufferedReader -> 보조 스트림
        // FileReader
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;


            while ((line = br.readLine()) != null) {

                // 첫줄 스킵
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                //
                String[] field = parseCsvLine(line);
                //System.out.println("field : " + Arrays.toString(field));

                if(field.length < 14){
                    System.out.println("잘못된 라인 : " + line);
                    continue;
                }

                pharmacies.add(new Pharmacy(field));

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        return pharmacies;
    }

    private static String[] parseCsvLine(String line) {
        List<String> result = new ArrayList<>();

        StringBuilder current = new StringBuilder();
        boolean inQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            if (c == '"') {
                inQuotes = !inQuotes;
            } else if (c == ',' && !inQuotes) {
                result.add(current.toString().trim());
                current.setLength(0); // 초기화
            } else {
                current.append(c);
            }


        }
        // 마지막 필드 추가
        result.add(current.toString().trim());
        return result.toArray(String[]::new);
    }
}
