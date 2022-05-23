package com.atguigu.spring5.service;

import com.atguigu.spring5.pojo.User;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author ccstart
 * @create 2022-04-22 17:11
 */


public interface UserService {
    //添加用户
    void addUser(User user);

    //查询用户
    User getUser(User user);

    //转账
    void accounts();
}
