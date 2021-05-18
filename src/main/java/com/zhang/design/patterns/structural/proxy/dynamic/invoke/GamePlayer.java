package com.zhang.design.patterns.structural.proxy.dynamic.invoke;

public class GamePlayer implements IGamePlayer {
    @Override
    public void login() {
        System.out.println("登录了...");
    }

    @Override
    public void play() {
        System.out.println("开始玩耍...");
    }
}
