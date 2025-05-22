package org.scoula.travel.dao;

import org.scoula.common.JDBCUtil;
import org.scoula.travel.domain.TravelImageVO;
import org.scoula.travel.domain.TravelVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TravelDaoImpl implements TravelDao {

    Connection conn = JDBCUtil.getConnection();

    private TravelVO map(ResultSet rs) throws SQLException {
        return TravelVO.builder()
                .no(rs.getLong("no"))                    // 여행지 번호
                .district(rs.getString("district"))      // 지역
                .title(rs.getString("title"))            // 제목
                .description(rs.getString("description")) // 설명
                .address(rs.getString("address"))        // 주소
                .phone(rs.getString("phone"))            // 전화번호
                .build();
    }

    private TravelImageVO mapImage(ResultSet rs) throws SQLException {
        return TravelImageVO.builder()
                .no(rs.getLong("tino"))              // 이미지 번호
                .filename(rs.getString("filename"))  // 파일명
                .travelNo(rs.getLong("travel_no"))   // 연관된 여행지 번호
                .build();
    }

    @Override
    public void insert(TravelVO travelVO) {
        //database create
        String sql = "insert into tbl_travel(no,district,title,description,address,phone) values(?,?,?,?,?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // query 완성시키기
            pstmt.setLong(1, travelVO.getNo());
            pstmt.setString(2, travelVO.getDistrict());
            pstmt.setString(3, travelVO.getTitle());
            pstmt.setString(4, travelVO.getDescription());
            pstmt.setString(5, travelVO.getAddress());
            pstmt.setString(6, travelVO.getPhone());

            int count = pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void insertImage(TravelImageVO travelImageVO) {
        String sql = "insert into tbl_travel_image(filename, travel_no) values(?,?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            // 1. 쿼리 완성시키기
            pstmt.setString(1, travelImageVO.getFilename());
            pstmt.setLong(2, travelImageVO.getTravelNo());
            // 2. 쿼리 실행
            int count = pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public int getTotalCount() {
        String sql = "SELECT count(*) FROM tbl_travel";

        // try-with-resources, 여러 객체 등록 가능
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {

            rs.next(); // 첫 번째 행으로 이동 -> 조회 결과 무조건 1행
            return rs.getInt(1); // 첫 번째 컬럼의 count 값 반환

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<String> getDistricts() {
        List<String> districts = new ArrayList<>();
        String sql = "SELECT DISTINCT(district) FROM tbl_travel ORDER BY district";
        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {
                districts.add(rs.getString("district"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return districts;
    }

    @Override
    public List<TravelVO> getTravels() {
        List<TravelVO> travels = new ArrayList<>();

        String sql = "SELECT * FROM tbl_travel ORDER BY district, title";

        try (PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            while (rs.next()) {

                // ResultSet -> TravelVO 객체 매핑 메서드 호출
                TravelVO travel = map(rs);
                travels.add(travel);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return travels;
    }

    @Override
    public List<TravelVO> getTravels(int page) {
        List<TravelVO> travels = new ArrayList<>();

        String sql = "SELECT * FROM tbl_travel ORDER BY district, title LIMIT ?,?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            int count = 10;                    // 페이지당 항목 수
            int start = (page - 1) * count;    // 시작 인덱스 계산

            // 페이징 파라미터 바인딩
            pstmt.setInt(1, start);  // OFFSET
            pstmt.setInt(2, count);  // LIMIT

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    TravelVO travel = map(rs);
                    travels.add(travel);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return travels;
    }

    @Override
    public List<TravelVO> getTravels(String district) {
        List<TravelVO> travels = new ArrayList<TravelVO>();

        String sql = "SELECT * FROM tbl_travel WHERE district = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, district); // 지역명 파라미터 바인딩
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    TravelVO travel = map(rs);
                    travels.add(travel);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return travels;
    }

    @Override
    public Optional<TravelVO> getTravel(Long no) {
        TravelVO travel = null;

        String sql = """
                SELECT 
                    t.*, ti.no AS tino, 
                    ti.filename, 
                    ti.travel_no
                FROM 
                    tbl_travel t
                 LEFT OUTER JOIN 
                    tbl_travel_image ti ON t.no = ti.travel_no
                WHERE t.no = ?
            """;

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setLong(1, no); // 여행지 번호 파라미터 바인딩

            try (ResultSet rs = pstmt.executeQuery()) {


                if (rs.next()) {

                    // 첫 번째 행에서 여행지 기본 정보 매핑
                    travel = map(rs);

                    // 이미지 정보를 저장할 List 생성
                    List<TravelImageVO> images = new ArrayList<>();

                    // 조회 결과에서 이미지 정보만 추출
                    try {
                        do {
                            TravelImageVO image = mapImage(rs);
                            images.add(image);
                        } while (rs.next()); // 다음 행으로 이동
                    } catch (SQLException e) {
                        // 이미지가 없는 경우 발생하는 예외 (무시)
                    }

                    travel.setImages(images); // TravelVO 필드에 이미지 리스트 세팅
                    return Optional.of(travel);
                } else {
                    return Optional.empty(); // 여행지가 없다면 빈 Optional 객체 반환
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
