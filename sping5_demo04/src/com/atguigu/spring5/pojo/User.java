package com.atguigu.spring5.pojo;

/**
 * @author ccstart
 * @create 2022-04-22 17:11
 */
public class User {
    private Integer id;
    private String name;
    private String passWord;
    private String address;
    private String phone;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passWord='" + passWord + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addRess) {
        this.address = addRess;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User(Integer id, String name, String passWord, String addRess, String phone) {
        this.id = id;
        this.name = name;
        this.passWord = passWord;
        this.address = addRess;
        this.phone = phone;
    }

    public User() {
    }
}
