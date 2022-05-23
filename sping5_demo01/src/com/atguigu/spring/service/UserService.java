package com.atguigu.spring.service;

import com.atguigu.spring.dao.UserDAO;

/**
 * @author ccstart
 * @create 2022-04-19 22:16
 */
public class UserService {
    //现在使用这种方式注入，还需要提供set方法,肯定不好(有更简单的方式)
    private UserDAO userDAO;
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public void add(){
        System.out.println("service...");
        userDAO.update();
    }
}
