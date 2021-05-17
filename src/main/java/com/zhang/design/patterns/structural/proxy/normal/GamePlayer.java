package com.zhang.design.patterns.structural.proxy.normal;

public class GamePlayer implements IGamePlayer{

    @Override
    public void playGame() {
        System.out.println("开始玩游戏,打怪升级...肝的很累...");
    }
}
