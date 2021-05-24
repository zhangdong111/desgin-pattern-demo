package com.zhang.design.patterns.structural.flyweight.flyweight.impl;

import com.zhang.design.patterns.structural.flyweight.flyweight.AbstractFlyWeight;

public class ConcreteFlyWeight extends AbstractFlyWeight {


    public ConcreteFlyWeight(String outter1, String outter2) {
        super(outter1, outter2);
    }

    @Override
    public void doSomething() {
        System.out.println(super.getInner1() + this.outter1);
        System.out.println(super.getInner2() + this.outter2);
    }
}
