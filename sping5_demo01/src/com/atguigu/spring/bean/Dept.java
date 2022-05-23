package com.atguigu.spring.bean;

import java.util.List;

/**
 * @author ccstart
 * @create 2022-04-19 22:30
 */
public class Dept {
    private String dname;
    private List<emp> emps;

    public void setEmps(List<emp> emps) {
        this.emps = emps;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                ", emps=" + emps +
                '}';
    }
}
