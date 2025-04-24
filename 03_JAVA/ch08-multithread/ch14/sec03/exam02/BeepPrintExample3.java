package basic.ch14.sec03.exam02;

import java.awt.*;

public class BeepPrintExample3 {
    public static void main(String[] args) {

        // 익명 클래스 : 이름 없이 인터페이스나 추상 클래스는 즉석에서 구현하는 클래스
        // 익명 객체 : 익명클래스로 만든 객체

        /*
            Thread 클래스로 run()을 구현하는 경우 상속으로 하기 때문에
            추가로 다른 기능들을 상속할 수 없음 -> 하나의 일만 스레드와 연결됨
         */
        Thread thread = new Thread(){
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();

                for (int i = 0; i < 5; i++) {
                    toolkit.beep();

                    try {
                        Thread.sleep(500);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.start();

        // 메인 스레드에서는 for문 동작
        for (int i = 0 ; i < 5; i++){
            System.out.println("띵");

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
