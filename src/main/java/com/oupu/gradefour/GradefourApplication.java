package com.oupu.gradefour;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.oupu.gradefour.dao.")
public class GradefourApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradefourApplication.class, args);
    }

}
