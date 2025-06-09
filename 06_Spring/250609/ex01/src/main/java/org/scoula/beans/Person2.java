package org.scoula.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person2 {

    // 어노테이션으로 주입하는 방법 3가지
    // 1. 필드위에 표시 - 예전에 많이 사용하던 방법
    // 2. 생성자에 표시 - 권장하는 방법
    // 3. setMethod에 표시
    // parrot을 person보다 나중에 만들어서 주입함 -> 1,3번

    private String name;

    // 싱글톤 중에서 자동으로 Parrot2 클로스로 만들어진 것이 있으면 주입
    // @Autowired
    // private final Parrot2 parrot;
    // 생성자로 주입 장점
    // 1. final을 통해 불변성 확보
    // 2. 의존성 보장 가능 (순환 참조 문제 해결)
    // 3. 코드 가독성 향상 (해당 객체가 어떤 의존성을 가진지 명확히 알 수 있음)
    private Parrot2 parrot;

    // 2번째 방법
    // @Autowired
    Person2(Parrot2 parrot){
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot2 getParrot() {
        return parrot;
    }

    // 3번째 방법
    @Autowired
    public void setParrot(Parrot2 parrot) {
        this.parrot = parrot;
    }
}
