package com.zhang.design.patterns.structural.flyweight.flyweight;

public abstract class AbstractFlyWeight {

    protected final String inner1;

    protected final String inner2;

    protected final String inner3;

    public AbstractFlyWeight(String inner1, String inner2, String inner3) {
        this.inner1 = inner1;
        this.inner2 = inner2;
        this.inner3 = inner3;
    }



    public void doSomething(String outter1 ,String outter2){
        System.out.println("this.inner1 + this.outrer2 = " + this.inner1 + outter1 );
    }
}
