package com.zhang.design.patterns.structural.proxy.dynamic.invoke;



import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GamePlayerHandler implements InvocationHandler {

    Class clazz = null;

    Object object = null;

    public GamePlayerHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName() == "login"){
            System.out.println("代理需要和用户获取用户密码信息才能登录。。。");
        }
        Object result = method.invoke(this.object,args);
        return result;
    }
}
