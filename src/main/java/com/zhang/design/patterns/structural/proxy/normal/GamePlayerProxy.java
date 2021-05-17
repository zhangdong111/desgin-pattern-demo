package com.zhang.design.patterns.structural.proxy.normal;

public class GamePlayerProxy implements IGamePlayer{

    IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void playGame() {
        System.out.println("把玩游戏交给代练来完成...");
        this.gamePlayer.playGame();
        System.out.println("代练收钱...");
    }
}
