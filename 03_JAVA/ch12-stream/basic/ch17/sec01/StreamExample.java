package basic.ch17.sec01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

/*
    스트림 특징
    1. 원본데이터를 변경시키지 않는다.
    2. 일회용이기 때문에 최종 연산 이후에는 다시 스트림을 생성해야한다.
    3. 작업을 내부적으로 반복처리한다.
    4. 병렬처리가 용이하다.
 */

public class StreamExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("홍길동");
        set.add("신용권");
        set.add("감자바");

        // 향상된 for문 사용
        System.out.println("======== for문 사용 ========");
        for (String str : set){
            System.out.println(str);
        }

        // Stream 사용
        System.out.println("======== stream 사용 ========");
        Stream<String> stream = set.stream();
        stream.forEach(name -> System.out.println(name));

        // set 내부 foreach 사용
        System.out.println("======== set foreach 사용 ========");
        set.forEach(name -> System.out.println(name));

        System.out.println("=== 추가 기능 ===");
        set.stream()
                // 사전 순으로 정렬 (.sorted(Comparator.reverseOrder()) : 역순으로 정렬)
                .sorted()
                // 앞에서부터 크기만큼 자르기
                .limit(2)
                .forEach(System.out::println);

    }
}
