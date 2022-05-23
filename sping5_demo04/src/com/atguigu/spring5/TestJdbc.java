package com.atguigu.spring5;

import com.atguigu.spring5.pojo.User;
import com.atguigu.spring5.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ccstart
 * @create 2022-04-22 17:23
 */
public class TestJdbc {
    @Test
    public void test(){

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("userServiceImpl");
        userServiceImpl.accounts();

    }
}
