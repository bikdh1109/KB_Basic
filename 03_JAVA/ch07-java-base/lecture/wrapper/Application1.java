package lecture.wrapper;

public class Application1 {

    /*
     *  기본타입        래퍼클래스
     *  byte          Byte
     *  short         Short
     *  int           Integer
     *  long          Long
     *  float         Float
     *  double        Double
     *  char          Character
     *  boolean       Boolean
     */

    /*
        박싱과 언박싱
        박싱 : 기본타입을 래퍼클래스의 인스턴스로 인스턴스화 하는 것
        언박싱 : 래퍼클래스의 인스턴스를 기본타입으로 바꾸는 것
     */
    public static void main(String[] args) {
        int intValue = 10;
        //박싱
//  Integer boxingNumber = new Integer(intValue); -> 사용하지 않음
        Integer boxingNumber = intValue;
        Integer boxingNumber2 = Integer.valueOf(intValue);
        System.out.println(boxingNumber);
        int unBoxingNumber = boxingNumber;
        System.out.println(unBoxingNumber);

        // 동등 비교
        Integer num1 = 10;
        Integer num2 = 10;
        int num3 = 10;
        int num4 = 10;
        System.out.println(num1==num2);
        System.out.println(num1==num3);
        System.out.println(num3==num4);

    }


}
