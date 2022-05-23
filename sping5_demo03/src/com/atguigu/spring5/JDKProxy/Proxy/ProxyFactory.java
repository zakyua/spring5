package com.atguigu.spring5.JDKProxy.Proxy;

import java.lang.reflect.Proxy;

/**
 * @author ccstart
 * @create 2022-04-21 16:20
 */
//代理类工厂
public class ProxyFactory {
    /**
     * 返回一个代理类对象
     * @param obj  被代理类的对象
     * @return
     */
    public static Object getProxyInstance(Object obj){
        Class<?>[] interfaces = obj.getClass().getInterfaces();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(obj);
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), interfaces, myInvocationHandler);
    }
}
