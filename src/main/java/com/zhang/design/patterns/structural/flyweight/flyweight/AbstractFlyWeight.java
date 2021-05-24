package com.zhang.design.patterns.structural.flyweight.flyweight;

public abstract class AbstractFlyWeight {

    private String inner1;

    private String inner2;

    protected String outter1;

    protected String outter2;

    public AbstractFlyWeight(String outter1, String outter2) {
        this.outter1 = outter1;
        this.outter2 = outter2;
    }

    public String getInner1() {
        return inner1;
    }

    public void setInner1(String inner1) {
        this.inner1 = inner1;
    }

    public String getInner2() {
        return inner2;
    }

    public void setInner2(String inner2) {
        this.inner2 = inner2;
    }

    public abstract void doSomething();
}
