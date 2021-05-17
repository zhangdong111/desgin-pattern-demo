package com.zhang.design.patterns.structural.proxy.normal;

public class Client {

    public static void main(String[] args) {
        IGamePlayer gamePlayer = new GamePlayer();
        GamePlayerProxy playerProxy = new GamePlayerProxy(gamePlayer);
        playerProxy.playGame();


    }

}
