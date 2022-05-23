package com.atguigu.spring;

/**
 * @author ccstart
 * @create 2022-04-19 20:20
 */
public class Orders {
    private String oname;
    private String addRess;

    public Orders(String oname, String addRess) {
        this.oname = oname;
        this.addRess = addRess;
    }

    public Orders() {
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                ", addRess='" + addRess + '\'' +
                '}';
    }
}
