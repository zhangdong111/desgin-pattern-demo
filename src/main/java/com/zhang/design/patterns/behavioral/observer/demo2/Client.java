package com.zhang.design.patterns.behavioral.observer.demo2;



/**
 * @author Rexxar
 * @date 2021/8/1
 */
public class Client {

    public static void main(String[] args) {

        ConcreteObserver observe1 = new ConcreteObserver();
        ConcreteObserver observe2 = new ConcreteObserver();
        ConcreteObserverable observable = new ConcreteObserverable();
        observable.addObserver(observe1);
        observable.addObserver(observe2);
        observable.sendMessage("消息");


    }


}
