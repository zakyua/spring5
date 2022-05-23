package com.atguigu.spring5.JDKProxy.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author ccstart
 * @create 2022-04-21 16:22
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object obj;
    public MyInvocationHandler(Object obj){
        this.obj=obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("之前....");
        Object invoke = method.invoke(obj, args);
        System.out.println("之后.....");
        return invoke;
    }
}
