package lecture.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        /*
            Calculating : 최소/최대/종합/평균과 같은 결과
         */

        long count = IntStream.range(1, 10).count();
        long sum = IntStream.range(1, 10).sum();

        System.out.println("count : " + count);
        System.out.println("sum : " + sum);

        // max, min 최정연산 메소드는 해당 스트림이 어떤 작업인지 모르기때문에 반환형이 Optional
        OptionalInt max = IntStream.range(1,10).max();
        OptionalInt min = IntStream.range(1,10).min();
    }
}
