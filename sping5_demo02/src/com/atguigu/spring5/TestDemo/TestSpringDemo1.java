package com.atguigu.spring5.TestDemo;

import com.atguigu.autowire.emp;
import com.atguigu.factoryBean.MyBean;
import com.atguigu.factoryBean.Orders;

import com.atguigu.spring5.collectionTest.Book;
import com.atguigu.spring5.collectionTest.Course;
import com.atguigu.spring5.collectionTest.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ccstart
 * @create 2022-04-19 23:09
 */
public class TestSpringDemo1 {

    @Test
    public void testCollection(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean02.xml");

        Stu stu = context.getBean("stu", Stu.class);
        stu.test();
    }
    @Test
    public void testCollection2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean02.xml");

        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book2);
    }
    @Test
    public void testCollection3(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean03.xml");
        //默认返回的是一个MyBean类型的
        MyBean myBean = context.getBean("bean", MyBean.class);
        System.out.println(myBean);
    }
    @Test
    public void testCollection4(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean03.xml");
        //实现FactoryBean接口,返回指定的类型
        Course myBean = context.getBean("bean", Course.class);
        System.out.println(myBean);
    }
    @Test
    public void testCollection5(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean04.xml");
        //实现FactoryBean接口,返回指定的类型
        Orders order = context.getBean("orders", Orders.class);
        System.out.println("第四步,得到对象");
        //销毁对象
        ((ClassPathXmlApplicationContext)context).close();
    }
    @Test
    public void testCollection6(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean05.xml");
        //实现FactoryBean接口,返回指定的类型
        emp emps = context.getBean("emp", emp.class);
        System.out.println(emps);
    }

}
