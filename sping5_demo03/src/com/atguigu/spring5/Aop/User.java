package com.atguigu.spring5.Aop;

import org.springframework.stereotype.Component;

/**
 * @author ccstart
 * @create 2022-04-21 16:39
 */

@Component
public class User {

    public void add(){
        System.out.println("add...");
    }
}
