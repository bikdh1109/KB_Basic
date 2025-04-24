package lecture.date;

import java.util.Calendar;
import java.util.Date;

public class Application1 {
    public static void main(String[] args) {
        Date legacyDate = new Date();
        legacyDate.setYear(2025);
        System.out.println(legacyDate); // 1900이 되서 출력됨

        // Calendar 0월 부터 시작
        Calendar cal = Calendar.getInstance();
        cal.set(2025,4,24);
        System.out.println(cal.getTime());
    }
}
