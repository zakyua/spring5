package com.atguigu.spring.bean;

/**
 * @author ccstart
 * @create 2022-04-19 22:31
 */
public class emp {
    private String ename;
    private String gender;
    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add(){
        System.out.println(ename);
        System.out.println(gender);
        System.out.println(dept.toString());
    }
}
