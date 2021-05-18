package com.zhang.design.patterns.structural.proxy.force;

public class Client {

    public static void main(String[] args) {
        ISinger singerProxy = new Singer().getSingleProxy();
        singerProxy.plan();
        singerProxy.sing();
        singerProxy.getMoney();
    }


}
