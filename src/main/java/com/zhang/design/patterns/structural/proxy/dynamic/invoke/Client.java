package com.zhang.design.patterns.structural.proxy.dynamic.invoke;

import java.lang.reflect.Proxy;

public class Client {


    public static void main(String[] args) {

        IGamePlayer gamePlayer = new GamePlayer();

        GamePlayerHandler handler = new GamePlayerHandler(gamePlayer);

        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(GamePlayer.class.getClassLoader(),GamePlayer.class.getInterfaces(),handler);

        proxy.login();

        proxy.play();

    }


}
