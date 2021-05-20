package com.zhang.design.patterns.structural.proxy.dynamic.aop.proxy;

import com.zhang.design.patterns.structural.proxy.dynamic.aop.advice.BeforeAdvice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler){
        if(true){
            new BeforeAdvice().exce();
        }
        return (T) Proxy.newProxyInstance(classLoader,interfaces,handler);
    }



}
