package basic.ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        ((Child) parent).field2 = "data2";
        ((Child) parent).method3();
        Child child = (Child) parent;
        child.field2 = "data2";
        child.method3();
    }
}
