package com.zhang.design.patterns.creator.singleton;

public class SingletonDemo {

    private SingletonDemo(){}

    private static class InstanceHolder{
        private static SingletonDemo INSTANCE = new SingletonDemo();
    }

    public static SingletonDemo getInstance(){
        return InstanceHolder.INSTANCE;
    }

}
