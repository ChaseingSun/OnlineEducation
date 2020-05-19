package com.lukas.onlineeducation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lukas.onlineeducation.mapper")
public class OnlineeducationApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnlineeducationApplication.class, args);
    }

}
