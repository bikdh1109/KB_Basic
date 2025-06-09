package org.scoula.config;

import org.scoula.domain.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig2 {
    @Bean
    Parrot parrot1()
    {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }
    @Bean(name = "miki")
    Parrot parrot2()
    {
        var p = new Parrot();
        p.setName("Miki");
        return p;
    }
    @Bean
    Parrot parrot3()
    {
        var p = new Parrot();
        p.setName("Riki");
        return p;
    }
}
// 설정이 다른 Parrot 객체를 여러개 만들어야 하는 경우
// 메서드 이름이 객체 이름이 됨 ex) Parrot parrot1 = new Parrot();
// 별도로 설정 가능 ex) @Bean(name = "miki")
