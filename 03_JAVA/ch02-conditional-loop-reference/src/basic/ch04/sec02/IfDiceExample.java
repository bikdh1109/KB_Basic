package basic.ch04.sec02;

import java.util.Random;

public class IfDiceExample {
    public static void main(String[] args) {
        // Math.random : 0<= x < 1
        int num = (int) (Math.random() * 6) + 1;

        if (num == 1) {
            System.out.println("1번이 나왔습니다.");

        } else if (num == 2) {
            System.out.println("2번이 나왔습니다.");
        } else if (num == 3) {
            System.out.println("3번이 나왔습니다.");
        } else if (num == 4) {
            System.out.println("4번이 나왔습니다.");
        } else if (num == 5) {
            System.out.println("5번이 나왔습니다.");
        } else if (num == 6) {
            System.out.println("6번이 나왔습니다.");
        }

        Random rand = new Random();
        // 0 <= x < bound 값
        num = rand.nextInt(6) + 1;
        System.out.println("Random num: " + num);
    }
}
