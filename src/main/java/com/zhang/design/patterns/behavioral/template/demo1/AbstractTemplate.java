package com.zhang.design.patterns.behavioral.template.demo1;

/**
 * @author Rexxar
 * @date 2021/7/25
 */
public abstract class AbstractTemplate {

    protected  abstract void  stepA();

    protected  abstract void  stepB();

    protected  abstract void  stepC();

    public final void excute(){
        this.stepA();
        this.stepB();
        this.stepC();
    }

}
