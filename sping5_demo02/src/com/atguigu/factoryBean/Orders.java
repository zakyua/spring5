package com.atguigu.factoryBean;

/**
 * @author ccstart
 * @create 2022-04-20 10:36
 */
public class Orders {
    private String oname;

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步，设置属性值");
    }

    public Orders() {
        System.out.println("第一步，创建对象");
    }

    public void init(){
        System.out.println("第三步，初始化方法被调用");
    }

    public void destroy(){
        System.out.println("第5步，销毁对象");
    }

}
