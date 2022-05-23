package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ccstart
 * @create 2022-04-21 15:32
 */
//在注解中value属性值可以不写，默认是类名称，首字母小写
@Service(value = "userService")
public class UserService {

    @Autowired
    private UserDAO userDAO;
    public void add(){
        System.out.println("service add....");
        userDAO.getUser();
    }



}
