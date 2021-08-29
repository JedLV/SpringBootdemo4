package com.example.springbootdemo4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})  // 启动类头部声明
public class SpringBootdemo4Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootdemo4Application.class, args);
    }

}
