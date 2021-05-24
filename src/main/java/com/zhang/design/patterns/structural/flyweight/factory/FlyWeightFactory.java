package com.zhang.design.patterns.structural.flyweight.factory;

import com.zhang.design.patterns.structural.flyweight.flyweight.AbstractFlyWeight;
import com.zhang.design.patterns.structural.flyweight.flyweight.impl.ConcreteFlyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private static final Map<String, AbstractFlyWeight> POOL = new HashMap<>();

    public static AbstractFlyWeight getFlyWeight(String outter1,String outter2){
        String key = outter1 + outter2;
        if(POOL.containsKey(key)){
            return POOL.get(key);
        }else {
            AbstractFlyWeight flyWeight = new ConcreteFlyWeight(outter1,outter2);
            POOL.put(key,flyWeight);
            return flyWeight;
        }
    }

}
