package ch12.sec08;

import java.util.*;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH)+1) + "월 " + cal.get(Calendar.DAY_OF_MONTH) + "일");
        int dayofWeek = cal.get(Calendar.DAY_OF_WEEK);
        int time = cal.get(Calendar.HOUR_OF_DAY);
        String day = "";
        String afternoon = "";
        switch (dayofWeek){
            case 1:
                day = "일";
                break;
            case 2:
                day = "월";
                break;
            case 3:
                day = "화";
                break;
            case 4:
                day = "수";
                break;
            case 5:
                day = "목";
                break;
            case 6:
                day = "금";
                break;
            case 7:
                day = "토";
                break;
        }
        if (time <= 12){
            afternoon = "오전";
        }else{
            afternoon = "오후";
        }

        System.out.println(day + "요일 " + afternoon);

        System.out.println(time + "시 " + cal.get(Calendar.MINUTE) + "분 " + cal.get(Calendar.SECOND)+"초");

    }
}
