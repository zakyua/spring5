package com.atguigu.spring5.JDKProxy.Proxy;

import com.atguigu.spring5.JDKProxy.Human;
import com.atguigu.spring5.JDKProxy.superHuman;

/**
 * @author ccstart
 * @create 2022-04-21 16:20
 */
public class ProxyTest {
    public static void main(String[] args) {
        Human proxyInstance = (Human)ProxyFactory.getProxyInstance(new superHuman());
        proxyInstance.eat();
    }
}
