package com.twoGroup.educational;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@MapperScan(value = "com.twoGroup.educational.mapper")
@SpringBootApplication
@ServletComponentScan
public class AppBlogStart{
    public static void main(String[] args) {
        SpringApplication.run(AppBlogStart.class, args);
    }
}
