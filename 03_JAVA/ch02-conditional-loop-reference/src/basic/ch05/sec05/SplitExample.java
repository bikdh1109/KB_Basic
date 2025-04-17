package basic.ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {
        String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";



        for (String i : board.split(",")){
            System.out.println(i);
        }
    }
}
