package com.zhang.design.patterns.behavioral.observer.demo2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Rexxar
 * @date 2021/7/31
 */
public class ConcreteObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(this + "接收到了消息 :" + arg.toString());
    }
}
