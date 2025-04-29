package basic.lecture.generic;

public class GenericTest<T> {
    /*
        제네릭 설정은 클래스 선언부 마지막 부분에 <>를 이용해 작성
        관례상 대문자로 작성
     */
    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

}
