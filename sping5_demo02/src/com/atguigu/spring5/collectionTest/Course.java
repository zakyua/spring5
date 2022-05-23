package com.atguigu.spring5.collectionTest;

/**
 * @author ccstart
 * @create 2022-04-19 23:17
 */
public class Course {
    private String cname;

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cname='" + cname + '\'' +
                '}';
    }
}
