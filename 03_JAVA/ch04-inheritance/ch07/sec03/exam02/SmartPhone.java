package basic.ch07.sec03.exam02;

public class SmartPhone extends Phone {

    public SmartPhone(){
        // 부모의 기본생성자가 없고, 다른 생성자가 존재할 때
        // 부모의 기본생성자를 호출 할 수 없음
        super();
    }

    public SmartPhone(String model, String color){
        super(model, color);
        System.out.println("SmartPhone(String model, String color) 생성자 호출됨...");
    }

    @Override // 컴파일시 정확히 오버라이딩 되었는지 체크해줌
    public void printModel(){
        System.out.println("자식에서 호출됨... model = " + model);
    }
    // Override : 메소드 재정의
    // 부모가 가지는 메소드 선언부를 그대로 사용하면서, 자식 클래스에서 정의한대로 동작하도록 함

    // 오버라이딩의 성립 요건 : 메소드 이름, 리턴타입, 매개변수의 타입, 갯수, 순서가 동일해야 함
    // private method, final은 불가능
    // 접근제어자는 부모와 같거나 더 넓은 범위여야 함
    // 예외처리 : 같은 예외이거나 더 구체적인(하위) 예외 처리
}

/*
   자식 생성자에서는 부모 생성자를 무조건 호출
   부모 필드를 호출하려면, 부모 생성자가 그 필드를 매개변수로 받아야 하고,
   자식 생성자에서 super(필드에 대한 값)을 호출해야함
 */