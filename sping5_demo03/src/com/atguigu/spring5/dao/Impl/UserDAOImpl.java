package com.atguigu.spring5.dao.Impl;

import com.atguigu.spring5.dao.UserDAO;
import org.springframework.stereotype.Repository;

/**
 * @author ccstart
 * @create 2022-04-21 15:39
 */
@Repository
public class UserDAOImpl implements UserDAO {
    @Override
    public void getUser() {
        System.out.println("userDAO getUser...");
    }
}
