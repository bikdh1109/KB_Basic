package lecture.exception.section01;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        Scanner sc = new Scanner(System.in);

        System.out.print("물건의 가격을 입력해주세요 : ");
        int price = sc.nextInt();
        System.out.println();

        System.out.print("소지한 돈을 입력해주세요 : ");
        int money = sc.nextInt();
        System.out.println();

        try{
            et.checkEnoughMoney(price,money);
        }catch (Exception e){
            System.out.println("=== 상품 구입 불가능 ===");
        }finally {
            sc.close();
        }
        System.out.println("프로그램 종료!");
    }
}
