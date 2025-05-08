package basic.ch17.sec04.exam03;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamExample {
    public static int sum;

    /*
        순수함수와 부수효과
        순수함수 : 입력만으로 결과가 정해지고 외부 상태를 변경하지 않는 함수
        부수효과 : 함수나 메서드가 리턴값 이외에 외부 상태를 변경하는 행위
     */

    public static void main(String[] args) {

        // parallel : 병렬처리
        IntStream stream = IntStream.rangeClosed(1,100);
        stream.forEach(num -> sum += num);
        System.out.println("총합 : " + sum);

    }
}
