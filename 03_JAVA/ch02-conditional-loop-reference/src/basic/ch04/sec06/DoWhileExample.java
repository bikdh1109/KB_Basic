package basic.ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg;
        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");
        do {
            System.out.print(">");
            msg = sc.nextLine();
            System.out.println(msg);

        } while (!msg.equals("q"));
        System.out.println("프로그램 종료");
sc.close();
    }
}
