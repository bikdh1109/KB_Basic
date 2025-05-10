package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
    public static void main(String[] args) {

        try( BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            while (true){
                String data = br.readLine();
                if (data ==null )break;
                System.out.println(data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
