package com.atguigu.spring5.Aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author ccstart
 * @create 2022-04-21 16:51
 */
//增强类
@Component
@Aspect
public class UserProxy {
    //前置通知
    @Before(value ="execution(* com.atguigu.spring5.Aop.User.add(..))")
    public void before(){
        System.out.println("之前");
    }
}
