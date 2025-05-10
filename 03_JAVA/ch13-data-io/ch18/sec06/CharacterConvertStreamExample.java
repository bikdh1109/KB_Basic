package ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    /*
        OutputStreamWriter
        - 문자를 바이트로 변환해(인코딩) 출력하는 문자 스트림
        - 내부적으로 OutputStream 사용
        - 생성자에서 인코딩 타입을 지정
     */

    /*
        InputStreamReader
        - 바이트를 문자로 디코딩하여 읽는 문자 스트림
        - 내부적으로 InputStream 사용
        - 생성자에서 디코딩 지정 가능
     */

    public static void main(String[] args) {
        String str = "문자 변환 스트림을 사용합니다.";

        try {
            write(str);

            String data =  read();
            System.out.println("data = " + data);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void write(String str) throws Exception {
        Writer writer = new OutputStreamWriter(new FileOutputStream("test2.txt"), "UTF-8");

        writer.write(str);
        writer.close();
    }

    public static String read() throws Exception {
        Reader reader = new InputStreamReader(new FileInputStream("test2.txt"), "UTF-8");

        char[] data = new char[100];

        int num = reader.read(data);
        reader.close();
        // offset :  배열에서 문자열로 변환할 위치
        // num : 시작위치부터 몇개의 바이트를 변환할 것인지
        String str = new String(data, 0, num);

        return str;

    }
}
