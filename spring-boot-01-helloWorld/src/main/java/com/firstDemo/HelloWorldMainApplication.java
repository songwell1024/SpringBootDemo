package com.firstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 表明这个是SpringBoot应用的主程序类
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        //让Spring跑起来
        SpringApplication.run(HelloWorldMainApplication.class, args);
    }
}
