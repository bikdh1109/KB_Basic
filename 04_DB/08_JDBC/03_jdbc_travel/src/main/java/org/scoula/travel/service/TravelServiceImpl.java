package org.scoula.travel.service;

import lombok.RequiredArgsConstructor;
import org.scoula.travel.dao.TravelDao;
import org.scoula.travel.domain.TravelImageVO;
import org.scoula.travel.domain.TravelVO;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Lombok: final 필드에 대한 생성자 자동 생성
@RequiredArgsConstructor
public class TravelServiceImpl implements TravelService {


    private final TravelDao dao;

    private int getNumber(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        // nextLine()으로 전체 라인을 읽어 공백 문제 방지
        int num = Integer.parseInt(sc.nextLine());

        return num;
    }



    private void printDistricts(List<String> districts) {
        for (int i = 0; i < districts.size(); i++) {

            // 1부터 시작하는 번호와 함께 지역명 출력
            System.out.printf("%d] %s\n", i + 1, districts.get(i));
        }
    }


    private void printTravels(List<TravelVO> travels) {

        for (TravelVO travel : travels) {
            System.out.printf("%3d %6s  %s\n", travel.getNo(), travel.getDistrict(), travel.getTitle());
        }
    }



    @Override
    public void printTravels() {
        // DAO를 통해 전체 여행지 목록 조회
        List<TravelVO> travels = dao.getTravels();
        // 헬퍼 메서드로 정렬된 형태로 출력
        printTravels(travels);
    }


    @Override
    public void printTravelsByDistrict() {
        // 모든 지역 목록 조회
        List<String> districts = dao.getDistricts();

        // 지역 목록을 번호와 함께 출력
        printDistricts(districts);

        // 지역 번호 입력 받기
        int ix = getNumber("선택: ");

        // 선택된 인덱스에 해당하는 지역명 획득 (1부터 시작하므로 -1)
        String district = districts.get(ix - 1);

        // 해당 지역의 여행지 목록 조회
        List<TravelVO> travels = dao.getTravels(district);

        // 조회된 여행지 목록 출력
        printTravels(travels);
    }


    @Override
    public void printTravelsByPage() {

        // 전체 페이지 수 계산 (페이지당 10개 기준)
        int totalPage = (int) Math.ceil(dao.getTotalCount() / 10.0);
        System.out.printf("총 %d 페이지\n", totalPage);

        // 페이지 번호 입력 받기
        int page = getNumber(String.format("페이지 선택(1~%d): ", totalPage));

        // 선택된 페이지의 여행지 목록 조회
        List<TravelVO> travels = dao.getTravels(page);

        // 조회된 여행지 목록 출력
        printTravels(travels);
    }


    @Override
    public void printTravel() {

        // 여행지 번호 입력 받기
        long no = getNumber("관광지 No: ");

        // 여행지 상세 정보 조회
        // orElseThrow()로 데이터가 없으면 예외 발생
        TravelVO travel = dao.getTravel(no).orElseThrow(NoSuchElementException::new);

        // 여행지 기본 정보 출력
        System.out.println("권역: " + travel.getDistrict());
        System.out.println("제목: " + travel.getTitle());
        System.out.println("설명: " + travel.getDescription());
        System.out.println("주소: " + travel.getAddress());
        System.out.println("전화번호: " + travel.getPhone());

        // 관련 이미지 정보 출력
        System.out.println("사진들");
        for (TravelImageVO image : travel.getImages()) {
            // 이미지 번호와 파일명을 정렬하여 출력
            System.out.printf("  [%3d] %s\n", image.getNo(), image.getFilename());
        }
    }
}
