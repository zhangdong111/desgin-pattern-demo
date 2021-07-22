package com.zhang.design.patterns.structural.decorator.demo1.client;

import com.zhang.design.patterns.structural.decorator.demo1.component.Component;
import com.zhang.design.patterns.structural.decorator.demo1.component.impl.ComponentA;
import com.zhang.design.patterns.structural.decorator.demo1.decorator.impl.DecoratorA;
import com.zhang.design.patterns.structural.decorator.demo1.decorator.impl.DecoratorB;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public class Client {

    public static void main(String[] args) {
        Component component = new ComponentA();
        component = new DecoratorA(component);
        component = new DecoratorB(component);
        component.operation();
    }

}
