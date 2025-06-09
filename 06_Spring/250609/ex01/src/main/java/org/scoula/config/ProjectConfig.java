package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 설정파일로 스프링에 알려주는 역할
public class ProjectConfig {
    @Bean // 스프링에 싱글톤으로 만들어야 한다고 알려주는 어노테이션
    public Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p; // 스프링이 싱글톤으로 만들어서 관리
    }
    @Bean
    String hello()
    {
        return "Hello";
    }
    @Bean
    Integer ten()
    {
        return 10;
    }
}
// 내가 만든 클래스 이름위에 @Bean으로 싱글톤으로 만들 수 있음
// Config에 넣는 경우는 내가 만든 것이 아닌 경우, 클래스를 열어서 @Bean을 작성할 수 없음
// Config에서 객체를 생성하고 조립하게 해야함