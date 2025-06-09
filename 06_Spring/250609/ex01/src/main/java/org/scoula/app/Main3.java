package org.scoula.app;

import org.scoula.config.ProjectConfig3;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main3 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig3.class);
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p);
        System.out.println(p.getName());
        p.setName("Koko");
        System.out.println(p.getName());

        Parrot p2 = context.getBean(Parrot.class);
        System.out.println(p2.getName());
    }
}
