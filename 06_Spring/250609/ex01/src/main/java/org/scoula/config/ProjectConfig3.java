package org.scoula.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.scoula.domain") // 여러개인 경우 배열 형태로 작성
public class ProjectConfig3 {
}
