package org.scoula.app;

import org.scoula.config.ProjectConfig2;
import org.scoula.domain.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        // 설정파일에서 만든 싱글톤은 스프링 프로젝트 전체에서 사용됨
        // 스프링 프로젝트 전체에서 사용되는 설정을 하는 파일을 컨텍스트 파일이라고 함
        // 컨텍스트 파일에서 설정한 싱글톤 객체를 가지고 오려면 context 객체가 필요함.

        // 설정값이 다른 싱글톤으로 여러개 만들어야 하는 경우
        // 이름으로 필터링해서 가지고 와야함
        Parrot p1 = context.getBean("miki",Parrot.class);
        System.out.println(p1.getName());
        Parrot p2 = context.getBean("parrot1",Parrot.class);
        System.out.println(p2.getName());

    }
}
