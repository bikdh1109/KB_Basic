package basic.lecture.extend;

// T 타입변수는 Rabbit 타입 및 하위 타입들만 사용 가능
// 인터페이스인 경우에도 implements가 아닌 extends를 사용하여 작성
public class RabbitFarm <T extends Rabbit>{
    private T animal;

    public RabbitFarm(){
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
