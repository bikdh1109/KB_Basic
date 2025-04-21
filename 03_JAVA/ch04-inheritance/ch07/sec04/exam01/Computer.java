package basic.ch07.sec04.exam01;

public class Computer extends Calculator{
    public double areaCircle(double r) {
        double PI = Math.PI;
        System.out.println("Computer 객체의 areaCircle() 실행");
        return PI * r * r;
    }

}
