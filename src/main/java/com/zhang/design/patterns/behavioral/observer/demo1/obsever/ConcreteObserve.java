package com.zhang.design.patterns.behavioral.observer.demo1.obsever;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

/**
 * @author Rexxar
 * @date 2021/7/31
 */
public class ConcreteObserve implements IObserver {
    @Override
    public void update(String status) {
        System.out.println("status : " + status);
    }
}
