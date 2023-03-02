package com.sparta.cicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CicdtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CicdtestApplication.class, args);
    }

}
