package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        int result = data.length();
        System.out.println("문자 수 : " + result);
    }
        public static void main (String[] args){
            System.out.println("[프로그램 시작] \n");

            try {
                printLength("ThisIsJava");
                printLength(null);
            } catch (Exception e) {
                System.out.println("오류가 발생하였습니다.");
                System.out.println(e.getMessage());
                e.printStackTrace();
            }

            System.out.println("[프로그램 종료]");
        }
    }
