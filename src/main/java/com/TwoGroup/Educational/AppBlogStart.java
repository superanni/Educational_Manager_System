package com.TwoGroup.Educational;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"cn.superanni.han.blog.controller","cn.superanni.han.blog.Config"})
//@MapperScan(value = "cn.superanni.han.blog.dao")
@SpringBootApplication
@ServletComponentScan
public class AppBlogStart{
    public static void main(String[] args) {
        SpringApplication.run(AppBlogStart.class, args);
    }
}
