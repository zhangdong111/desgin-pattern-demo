package com.zhang.design.patterns.behavioral.observer.demo1.subject;

import com.zhang.design.patterns.behavioral.observer.demo1.obsever.IObserver;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author Rexxar
 * @date 2021/7/31
 */
public interface ISubject {

    List<IObserver> observerList = new LinkedList<>();

    void addObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyObservers();

}
