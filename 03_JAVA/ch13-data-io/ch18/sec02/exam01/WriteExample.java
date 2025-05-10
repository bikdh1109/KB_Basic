package ch18.sec02.exam01;

import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        try {
            OutputStream outputStream = new FileOutputStream("c:/TEMP/test1.db");
            byte a = 10;
            byte b = 20;
            byte c = 30;

            outputStream.write(a);
            outputStream.write(b);
            outputStream.write(c);

            outputStream.flush();
            outputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
