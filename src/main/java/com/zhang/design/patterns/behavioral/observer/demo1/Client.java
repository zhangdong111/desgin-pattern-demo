package com.zhang.design.patterns.behavioral.observer.demo1;

import com.zhang.design.patterns.behavioral.observer.demo1.obsever.ConcreteObserve;
import com.zhang.design.patterns.behavioral.observer.demo1.obsever.IObserver;
import com.zhang.design.patterns.behavioral.observer.demo1.subject.ISubject;
import com.zhang.design.patterns.behavioral.observer.demo1.subject.SubjectImpl;

/**
 * @author Rexxar
 * @date 2021/7/31
 */
public class Client {

    public static void main(String[] args) {
        IObserver observer1 = new ConcreteObserve();
        IObserver observer2 = new ConcreteObserve();
        ISubject subject = new SubjectImpl();
        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.notifyObservers();
    }
}
