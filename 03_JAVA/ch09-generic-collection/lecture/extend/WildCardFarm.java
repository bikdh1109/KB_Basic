package basic.lecture.extend;

public class WildCardFarm {

    // 모든 토끼 가능(Rabbit, Bunny, DrunkenBunny)
    public void anyType(RabbitFarm<?> farm){
        farm.getAnimal().cry();
    }

    // 토끼 중 Bunny와 Bunny 하위만 가능 (Bunny, DrunkenBunny)
    public void extendsType(RabbitFarm<? extends Bunny> farm){
        farm.getAnimal().cry();
    }

    // 토끼 중 Bunny와 Bunny 상위만 가능 (Bunny, Rabbit)
    public void superType(RabbitFarm<? super Bunny> farm){
        farm.getAnimal().cry();
    }

}
