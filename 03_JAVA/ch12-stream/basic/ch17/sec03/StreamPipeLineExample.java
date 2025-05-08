package basic.ch17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("홍길동", 10),
                new Student("신용권", 20),
                new Student("유미선", 30)
        );
        // 단계별로 변수에 저장
        // 1. stream으로 변환
        Stream<Student> studentStream = list.stream();

        // 2. student 내부의 score만 추출
        IntStream scoreStream = studentStream.mapToInt(student-> student.getScore());

        // Stream은 한번만 사용가능
        // IntStream scoreStream2 = studentStream.mapToInt(student-> student.getScore());


        // 3. 평균 구하기
        double avg = scoreStream.average().orElseThrow(()->new IllegalStateException("점수가 없음"));
        System.out.println("평균 점수 : " + avg);

        // 파이프라인 스타일
        double avg2 = list.stream()
                .mapToInt(student -> student.getScore())
                .average().orElseThrow(()-> new IllegalStateException("점수 없음"));
        System.out.println("평균 점수 : " + avg2);

        // stream 합치기
        Stream<Student> studentStream1 = list.stream();
        Stream<Student> studentStream2 = Stream.of(
                new Student("세종",40),
                new Student("광종",30)
        );

        Stream<Student> concatStudent = Stream.concat(studentStream1,studentStream2);
        concatStudent.forEach(s-> System.out.println(s.toString()));

    }
}
