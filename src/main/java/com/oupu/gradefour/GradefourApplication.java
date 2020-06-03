package com.oupu.gradefour;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//扫描所有dao下的mapper接口,接口上可以不写@mapper注解
@MapperScan("com.oupu.gradefour.dao")
public class GradefourApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradefourApplication.class, args);
    }

}
