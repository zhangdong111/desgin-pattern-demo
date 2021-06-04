package com.zhang.design.patterns.structural.flyweight.universal;

import com.zhang.design.patterns.structural.flyweight.universal.factory.FlyWeightFactory;
import com.zhang.design.patterns.structural.flyweight.universal.flyweight.AbstractFlyWeight;

public class Client {

    public static void main(String[] args) {
        AbstractFlyWeight flyWeight = FlyWeightFactory.getFlyWeight("1","2","3");
        flyWeight.doSomething("4","5");
    }

}
