package com.wql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@SpringBootApplication
public class TaskOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskOneApplication.class, args);
    }
    @PostConstruct
    public void init()
    {
        System.out.println("我是开始");
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("我是结束");
    }
}
