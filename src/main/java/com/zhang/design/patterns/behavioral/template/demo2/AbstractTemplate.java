package com.zhang.design.patterns.behavioral.template.demo2;

/**
 * @author Rexxar
 * @date 2021/7/25
 */
public abstract class AbstractTemplate {

    private void  stepA(){
        System.out.println("通用的A操作");
    }

    protected  abstract void  stepB();

    protected  abstract void  stepC();

    final void excute(){
        this.stepA();
        this.stepB();
        this.stepC();
    }

}
