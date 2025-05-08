package lecture.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application3 {
    public static void main(String[] args) {
        /*
            collect
            - collector 타입을 받아서 처리를 하는데, 메소드를 통해 컬렉션을 출력으로 받을 수 있다.
         */

        List<Member> memberList = Arrays.asList(
                new Member("test01", "testName01"),
                new Member("test02", "testName02"),
                new Member("test03", "testName03")
        );

        List<String > collector = memberList.stream()
                .map(m -> m.getMemberName())
                .toList();
        System.out.println(collector);

        String str = memberList.stream()
                .map(m -> m.getMemberName())
                .collect(Collectors.joining("/", "*시작*","*끝*"));
        // 모든 데이터를 구분자를 통해 하나의 문자열로 결합
        // 문자열의 처음과 끝에 넣을 수도 있다.
        System.out.println(str);

    }
}
