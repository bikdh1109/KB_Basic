package basic.ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        /*
            ✨ 다형성 ✨
            - 하나의 인스턴스가 여러가지 타입을 가질 수 있는 것을 의미
            - 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있게 하고,
              하나의 메소드 호출로 각기 다른 방법으로 동작하게 할 수 있다.
         */
        // A - B - D // A - C - E
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        // 업 캐스팅 : 자식 -> 부모로 대입시 자동 타입 형변환이 발생
        A a1 = new B();
        A a2 = new C();
        A a3 = new D();
        A a4 = new E();
        B b1 = new D();
        C c1 = new E();

        // E는 B와 관계 X
        // B b3 = new E();

        // D는 C와 관계 X
        // C c2 = new D();

        // 다운 캐스팅 : 부모 -> 자식 | 잘 사용하지 않음
        A a = new A();
        B b3 = (B) a;

        Object o = new B();
    }
}
