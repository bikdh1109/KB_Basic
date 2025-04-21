package basic.ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        // 자식 객체 생성
        Child child = new Child();

        // 부모 타입 -> child 업캐스팅
        Parent parent = child;
        parent.method1(); // Parent-method1
        parent.method2(); // Child-method2
        // parent.method3();
    }
}
