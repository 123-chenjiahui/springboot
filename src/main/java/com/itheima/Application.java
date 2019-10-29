package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;
//启动类

@SpringBootApplication
@MapperScan("com.itheima.mapper")   //扫描mapper包注解
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

    }

}
