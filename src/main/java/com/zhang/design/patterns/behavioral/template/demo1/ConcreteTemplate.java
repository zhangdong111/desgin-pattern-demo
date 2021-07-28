package com.zhang.design.patterns.behavioral.template.demo1;

/**
 * @author Rexxar
 * @date 2021/7/25
 */
public class ConcreteTemplate extends AbstractTemplate{
    @Override
    protected void stepA() {
        System.out.println("实现A的操作");
    }

    @Override
    protected void stepB() {
        System.out.println("实现B的操作");
    }

    @Override
    protected void stepC() {
        System.out.println("实现C的操作");
    }
}
