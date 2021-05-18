package com.zhang.design.patterns.structural.proxy.force;

public class SingleProxy implements ISinger {


    ISinger singer;

    public SingleProxy(ISinger singer) {
        this.singer = singer;
    }

    @Override
    public void plan() {
        this.singer.plan();
    }

    @Override
    public void sing() {
        this.singer.sing();
    }

    @Override
    public void getMoney() {
        this.singer.getMoney();
    }


}
