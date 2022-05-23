package com.atguigu.spring.testdemo;

import com.atguigu.spring.Book;
import com.atguigu.spring.Orders;
import com.atguigu.spring.User;
import com.atguigu.spring.bean.emp;
import com.atguigu.spring.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.UserDataHandler;

/**
 * @author ccstart
 * @create 2022-04-19 20:04
 */
public class TestSpring5 {

    @Test
    public void test1(){
        //ApplicationContext在加载文件的时候就把对象创建好了
        //BeanFactory在加载文件的时候没有将对象创建好，在获取对象的时候才创建对象
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean01.xml");
        //
//        User user = context.getBean("user", User.class);
//        user.add();

        Book book = context.getBean("book", Book.class);
        System.out.println(book.toString());


    }


    @Test
    public void test2(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean01.xml");
        Orders order = context.getBean("order", Orders.class);
        System.out.println(order);

    }

    @Test
    public void test4(){
        ApplicationContext context
                = new ClassPathXmlApplicationContext("bean01.xml");
        emp emps = context.getBean("emp", emp.class);
        emps.add();
//        System.out.println(userService);

    }



}
