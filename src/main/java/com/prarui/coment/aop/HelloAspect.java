package com.prarui.coment.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {
    @Before("execution(public * com.prarui.coment.controller.Hello.sayhello())")
    public void before(){
        System.out.print("------------------hello 方法执行前------------------- op");
    }

    @After("execution(public * com.prarui.coment.controller.Hello.sayhello())")
    public void after(){
        System.out.print("------------------hello 方法执行后-------------------");
    }
}
