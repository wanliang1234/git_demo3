package com.wql.Advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.jar.JarEntry;

@Component
@Aspect
public class MyAdvice
{
    @Pointcut("execution(* com.wql.controller.WorkController.getFy(..))")
    private void pointcut(){}

    @Around("pointcut()")
    public Object advice(JoinPoint j, ProceedingJoinPoint pj) throws Throwable {
        Object[] args = j.getArgs();
        args[0]=10;
        System.out.println("你好前");
        Object proceed = pj.proceed(args);
        System.out.println("你好后");
        return proceed;
    }
}
