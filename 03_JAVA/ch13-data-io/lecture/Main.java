package lecture;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pharmacy> pharmacies  = PharmacyReader.readCsv("약국목록.csv");

        for(Pharmacy p : pharmacies){
            System.out.println(p);
        }

        // 경기에 위치한 약국의 갯수 구하기
        // 전화번호 필드가 빈 약국만 걸러내기
        // 개설날짜가 2025년도인 약국만 조회하기
        List<Pharmacy> filteredPharmacy = pharmacies.stream()
                .filter(p -> p.getCityName().contains("경기"))
                .filter(p -> p.getPhone().isBlank())
                .filter(p -> p.getOpenDate().startsWith("2025"))
                .toList();
        filteredPharmacy.forEach(System.out::println);
        long count = pharmacies.stream()
                .filter(p -> p.getCityName().contains("경기"))
                .filter(p -> p.getPhone().isBlank())
                .filter(p -> p.getOpenDate().startsWith("2025"))
                .count();
        System.out.println("count = " + count);


    }
}
