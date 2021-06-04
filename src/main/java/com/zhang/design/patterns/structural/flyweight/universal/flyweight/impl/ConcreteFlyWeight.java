package com.zhang.design.patterns.structural.flyweight.universal.flyweight.impl;

import com.zhang.design.patterns.structural.flyweight.universal.flyweight.AbstractFlyWeight;

public class ConcreteFlyWeight extends AbstractFlyWeight {


    public ConcreteFlyWeight(String inner1, String inner2, String inner3) {
        super(inner1, inner2, inner3);
    }

    @Override
    public void doSomething(String outter1,String outter2) {
        System.out.println(super.inner1 + outter1);
        System.out.println(super.inner2 + outter2);
    }
}
