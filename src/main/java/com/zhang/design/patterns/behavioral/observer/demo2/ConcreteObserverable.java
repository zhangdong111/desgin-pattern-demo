package com.zhang.design.patterns.behavioral.observer.demo2;

import java.util.Observable;

/**
 * @author Rexxar
 * @date 2021/7/31
 */
public class ConcreteObserverable extends Observable implements ISubject{
    @Override
    public void sendMessage(String text) {
        this.setChanged();
        this.notifyObservers(text);
    }
}
