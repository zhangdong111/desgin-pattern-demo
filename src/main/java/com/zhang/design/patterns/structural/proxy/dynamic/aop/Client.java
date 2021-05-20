package com.zhang.design.patterns.structural.proxy.dynamic.aop;

import com.zhang.design.patterns.structural.proxy.dynamic.aop.handler.MyInvocationHandler;
import com.zhang.design.patterns.structural.proxy.dynamic.aop.proxy.DynamicProxy;
import com.zhang.design.patterns.structural.proxy.dynamic.aop.subject.ISubject;
import com.zhang.design.patterns.structural.proxy.dynamic.aop.subject.RealSubject;

import java.lang.reflect.InvocationHandler;

public class Client {


    public static void main(String[] args) {
        ISubject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        ISubject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);
        proxy.doSomething();
    }

}
