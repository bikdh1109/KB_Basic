package basic.ch05.sec05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVal1 = "홍길동";
        String strVal2 = "홍길동";

        if (strVal1==strVal2){
            System.out.println("strVal1과 strVal2는 참조가 같음");
        }
        if(strVal1.equals(strVal2)){
            System.out.println("strVal1과 strVal2는 문자열이 같음");
        }
        String strVal3 = new String("홍길등");
        String strVal4 = new String("홍길등");

        if (strVal3!=strVal4){
            System.out.println("strVal3과 strVal4는 참조가 다름");
        }
        if(strVal3.equals(strVal4)){
            System.out.println("strVal3과 strVal4는 문자열이 같음");
        }

    }
}
