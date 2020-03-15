package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.baizhi.mapper")
@SpringBootApplication
public class ZhwTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZhwTestApplication.class, args);
    }

}
