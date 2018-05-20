package com.example.go.ToGo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.example.go.ToGo.Repositories")
@SpringBootApplication
@EnableJpaAuditing
@ComponentScan(basePackages = "com.example.go.ToGo")
public class ToGoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToGoApplication.class, args);
    }
}
