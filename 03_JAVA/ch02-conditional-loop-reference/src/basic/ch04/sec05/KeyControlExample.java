package basic.ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {
        int speed = 0;

        while(true){
            System.out.println("--------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("--------------------------");

            Scanner sc = new Scanner(System.in);
            System.out.print("선택: ");
            String choice = sc.nextLine();

            if(choice.equals("1")){
                speed += 1;
                System.out.println("현재 속도 = "+ speed);
            }else if(choice.equals("2")){
                speed -= 1;
                System.out.println("현재 속도 = "+speed);
            } else if (choice.equals("3")) {
                System.out.println("프로그램 종료");
                break;
            }


        }


    }
}
