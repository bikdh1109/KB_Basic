package ch18.sec03.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {

        byte[] data = new byte[100];
        try {
            InputStream is = new FileInputStream("c:/TEMP/test2.db");

            while(true){
              int num = is.read(data);
              if(num == -1 ) break;
              for(int i =0 ; i< num ; i++){
                  System.out.println(data[i]);
              }

            }



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
