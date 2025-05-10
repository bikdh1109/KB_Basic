package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("c:/TEMP/test1.db");
            while(true){
                int num = is.read();
                if(num==-1) break;
                System.out.println(num);
            }

            is.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
