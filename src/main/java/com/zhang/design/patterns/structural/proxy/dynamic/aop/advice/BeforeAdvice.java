package com.zhang.design.patterns.structural.proxy.dynamic.aop.advice;

public class BeforeAdvice implements IAdvice {
    @Override
    public void exce() {
        System.out.println("前置通知执行。。。");
    }
}
