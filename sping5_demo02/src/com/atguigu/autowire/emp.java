package com.atguigu.autowire;

/**
 * @author ccstart
 * @create 2022-04-20 11:03
 */
public class emp {
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "emp{" +
                "dept=" + dept +
                '}';
    }
}
