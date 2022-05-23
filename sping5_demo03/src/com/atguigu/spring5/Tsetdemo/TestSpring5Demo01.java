package com.atguigu.spring5.Tsetdemo;

import com.atguigu.spring5.Aop.User;
import com.atguigu.spring5.Aop.UserProxy;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ccstart
 * @create 2022-04-21 15:26
 */
public class TestSpring5Demo01 {

    //使用配置文件
    @Test
        public void test(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean01.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
        //完全注解(使用注解类)
    @Test
    public void test1(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean01.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void test2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }



}
