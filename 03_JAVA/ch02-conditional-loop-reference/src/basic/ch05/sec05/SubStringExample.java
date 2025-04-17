package basic.ch05.sec05;

import java.util.Arrays;

public class SubStringExample {
    public static void main(String[] args) {
        // Substring - 원하는 범위만 잘라서 새로운 문자열 반환
        String ssn = "880815-1234567";
        // 인자가 1개일 때 - 해당 index부터 끝까지
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);
        // 인자가 2개일 때 - 시작 index부터 끝 index 앞까지
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);

        // split - 문자열을 특정 구분자를 기준으로 잘라서 문자열 배열로 반환
        String[] tokens =  ssn.split("-");
        System.out.println(Arrays.toString(tokens));
    }
}
