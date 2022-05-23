package com.atguigu.spring5.service.impl;

import com.atguigu.spring5.dao.UserDAO;
import com.atguigu.spring5.pojo.User;
import com.atguigu.spring5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.lang.annotation.Inherited;

/**
 * @author ccstart
 * @create 2022-04-22 17:16
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Override
    public void addUser(User user) {

        userDAO.addUser(user);
    }

    @Override
    public User getUser(User user) {

      return userDAO.getUserById(5);
    }


    //转账

    @Override
    public void accounts() {
        userDAO.account();
        //模拟异常

        userDAO.addMoney();
    }
}
