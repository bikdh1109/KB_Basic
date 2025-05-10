package ch18.sec04.exam01;

/*
    Writer
    - 문자 기반 출력 스트림의 최상위 추상 클래스
    - 2바이트 단위로 처리
    - FileWriter, InputStreamWriter 등을 사용
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try(Writer writer = new FileWriter("test.txt")){
            char a = 'A';
            char b = 'B';
            char[] arr = {'C', 'D', 'E'};
            writer.write(a);
            writer.write(b);
            writer.write(arr);

            // 안써도 close가 호출될 때 자동으로 호출됨
            writer.flush();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
