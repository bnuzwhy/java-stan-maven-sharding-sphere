package com.why;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.why.mapper")
public class ReadWriteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReadWriteApplication.class,args);
    }
}
