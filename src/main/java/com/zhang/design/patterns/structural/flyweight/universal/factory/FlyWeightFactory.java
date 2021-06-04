package com.zhang.design.patterns.structural.flyweight.universal.factory;

import com.zhang.design.patterns.structural.flyweight.universal.flyweight.AbstractFlyWeight;
import com.zhang.design.patterns.structural.flyweight.universal.flyweight.impl.ConcreteFlyWeight;

import java.util.HashMap;
import java.util.Map;

public class FlyWeightFactory {

    private static final Map<String, AbstractFlyWeight> POOL = new HashMap<>();

    public static AbstractFlyWeight getFlyWeight(String inner1,String inner2 ,String inner3){
        String key = inner1 + inner2 + inner3;
        if(POOL.containsKey(key)){
            return POOL.get(key);
        }else {
            AbstractFlyWeight flyWeight = new ConcreteFlyWeight(inner1,inner2,inner3);
            POOL.put(key,flyWeight);
            return flyWeight;
        }
    }

}
