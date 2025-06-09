package org.scoula.beans;

import org.scoula.beans.Parrot;
import org.springframework.beans.factory.annotation.Autowired;

public class Person {
    private String name;

    // 필드 주입
    // @Autowired
    // private Parrot parrot;
    private Parrot parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    // set method를 이용한 의존성 주입
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }
}
