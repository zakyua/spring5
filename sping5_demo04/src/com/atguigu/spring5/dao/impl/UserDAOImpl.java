package com.atguigu.spring5.dao.impl;

import com.atguigu.spring5.dao.UserDAO;
import com.atguigu.spring5.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author ccstart
 * @create 2022-04-22 17:17
 */
@Repository
public class UserDAOImpl implements UserDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //添加用户
    @Override
    public void addUser(User user) {

        String sql ="insert into user values(?,?,?,?,?)";
        jdbcTemplate.update(sql,user.getId(),user.getName(),user.getPassWord(),user.getAddress(),user.getPhone());
    }

    //查询用户
    @Override
    public User getUserById(Integer id) {
        String sql="SELECT id,pass PASSWORD FROM USER WHERE id = ?";
       return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),id);
    }

    //转账
    @Override
    public void account() {
       String sql = "update t_mon set money=money-? where username=?";
       jdbcTemplate.update(sql,"100","李杭鞠");
    }


    //收钱
    @Override
    public void addMoney() {
        String sql = "update t_mon set money=money+? where username=?";
        jdbcTemplate.update(sql,"100","牛童");
    }
}
