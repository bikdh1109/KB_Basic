package basic.ch08.lecture;

public interface InterProduct {
    /*
        인터페이스는 상수 필드만 작성 가능
        public static final
        -> 조합을 상수 필드, 선언과 동시에 초기화 해야함
     */

    // public static final을 컴파일러가 자동으로 적용시켜줌
    int MIN_NUM = 10;
    int MAX_NUM = 100;

    // 생성자를 가질 수 없음
    // public InterProduct() -> 불가능

    // method의 구현부가 없어야 함
    // public void nonStaticMethod(){};

    // 추상 메소드만 작성 가능
    // 인터페이스 내에 작성한 메소드는 public abstract의의미를 가진다.
    // 인터페이스를 상속받은 클래스는 메소드를 구현할 때, 접근제어자를 public으로 해야만 함
    void nonStaticMethod();
    void abstMethod();
    // static 메서드는 가질 수 있음 (java 8버전 이후)
    public static void staticMethod(){
        System.out.println("InterProduct 인터페이스에서 staticMethod 호출됨...");
    };
    // 인터페이스에서 일반 메소드를 만들기 위해서는 default 키워드를 붙여야 함
    public default void defaultMethod(){
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨...");
    }
}
