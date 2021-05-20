package com.zhang.design.patterns.structural.proxy.dynamic.aop.subject;

public class RealSubject implements ISubject {
    @Override
    public void doSomething() {
        System.out.println("do something...");
    }
}
