package org.scoula.database;

import org.scoula.travel.dao.TravelDao;
import org.scoula.travel.dao.TravelDaoImpl;
import org.scoula.travel.domain.TravelImageVO;

import java.io.File;

public class ImportImageData {
    public static void main(String[] args) {
        TravelDao dao = new TravelDaoImpl();

        File dir = new File("../travel-image");
        // 디렉토리 내에 있는 모든 파일 목록 읽어오기
        File[] files = dir.listFiles();

        for(File file : files){
            String fileName = file.getName();
            long travelNo = Long.parseLong(fileName.split("-")[0]);

            TravelImageVO imageVO = TravelImageVO.builder()
                    .filename(fileName)
                    .travelNo(travelNo)
                    .build();
            System.out.println(imageVO);
            dao.insertImage(imageVO);
        }
    }
}
