package basic.ch16.sec02.exam01;

public class LambdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        /*
            전략 패턴
            - 동작 방식을 자유롭게 바꾸고 싶을때 사용
                - Context -> Person
                - Interface -> Workable (추상메서드 : work)
                - Concrete Strategy -> 실제 구현체
         */

        person.action(()->{
            System.out.println("출근을 합니다.");
            System.out.println("프로그래밍을 합니다.");
        });

        person.action(()-> System.out.println("퇴근합니다."));

    }
}
