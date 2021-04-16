package com.zhang.design.patterns.creator.abstracts.car;

public interface ICar {

    String getBand();

    String getMode();

    default void run(){
        System.out.println(getBand()+""+getMode() + "跑起来了...");
    }

}
