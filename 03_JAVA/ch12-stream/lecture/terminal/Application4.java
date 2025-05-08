package lecture.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        /*
            match
            - anyMatch : 하나라도 조건이 만족하는 값이 있는지
            - allMatch : 모든 조건을 만족하는지
            - noneMatch : 모든 조건을 만족하지 않는지
         */

        List<String> stringList = Arrays.asList("Java","Spring","Springboot");

        // 문자열에 포함된게 있는지 확인
        boolean anyMatch = stringList.stream().anyMatch(str -> str.contains("p"));
        System.out.println("anyMatch : " + anyMatch);

        boolean allMatch = stringList.stream().allMatch(str -> str.contains("p"));
        System.out.println("allMatch : " + allMatch);

        boolean noneMatch = stringList.stream().noneMatch(str -> str.contains("x"));
        System.out.println("noneMatch : " + noneMatch);
    }
}
