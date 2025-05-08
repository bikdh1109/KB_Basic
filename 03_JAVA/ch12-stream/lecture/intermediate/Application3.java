package lecture.intermediate;

import java.util.List;
import java.util.stream.IntStream;

public class Application3 {
    public static void main(String[] args) {
        /*
            sorted(Comparator<>()) : 스트림에 담긴 데이터를 정렬해서 반환
         */

        // 각 정수를 Intger 형태로 변환한 뒤, 리스트로 변환
        List<Integer> integerList = IntStream.of(5,10,99,2,4,6).boxed().sorted().toList();

        System.out.println(integerList);

    }
}
