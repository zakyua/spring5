package com.atguigu.spring5.dao;

import com.atguigu.spring5.pojo.User;

import javax.swing.*;

/**
 * @author ccstart
 * @create 2022-04-22 17:16
 */
public interface UserDAO {
    //添加用户
    void addUser(User user);
    //查询用户
    User getUserById(Integer id);
    //转账
    void account();

    //收钱
    void addMoney();
}
