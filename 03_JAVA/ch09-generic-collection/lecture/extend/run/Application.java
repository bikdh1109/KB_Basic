package basic.lecture.extend.run;

import basic.lecture.extend.*;

public class Application {
    public static void main(String[] args) {
        // 제네릭 클래스 작성시 extends 키워드를 이용하여 특정 타입만 제한을 걸 수 있다.
        // 특정 타입만 사용하도록 제한, 특정 타입 및 특정 타입의 자식타입들도 대입 가능

        // Rabbit이거나 후손 타입만 경우에만 사용 가능
//      RabbitFarm<Mammal> farm1 = new RabbitFarm<>(); -> 불가능
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();
//      farm1.setAnimal(new Snake()); -> 불가능
        farm1.setAnimal(new Rabbit());
        farm1.getAnimal().cry();

        farm2.setAnimal(new Bunny());
        farm2.getAnimal().cry();

        farm3.setAnimal(new DrunkenBunny());
        farm3.getAnimal().cry();

    }
}
