package com.zhang.design.patterns.structural.proxy.force;

public class Singer implements ISinger {

    private ISinger singleProxy;

    @Override
    public void plan() {
        System.out.println("安排档期...");
    }

    @Override
    public void sing() {
        System.out.println("唱歌...");
    }

    @Override
    public void getMoney() {
        System.out.println("收钱...");
    }


    public  ISinger getSingleProxy() {
        this.singleProxy =  new SingleProxy(this);
        return this.singleProxy;
    }
}
