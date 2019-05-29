package com.twoGroup.educational;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"cn.superanni.han.blog.controller","cn.superanni.han.blog.config"})
@SpringBootApplication
@ServletComponentScan
@MapperScan(value = "com.twoGroup.educational.mapper")
public class AppBlogStart{
    public static void main(String[] args) {
        SpringApplication.run(AppBlogStart.class, args);
    }
}
