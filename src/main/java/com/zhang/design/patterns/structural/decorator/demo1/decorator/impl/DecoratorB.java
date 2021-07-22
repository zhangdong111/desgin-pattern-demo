package com.zhang.design.patterns.structural.decorator.demo1.decorator.impl;

import com.zhang.design.patterns.structural.decorator.demo1.component.Component;
import com.zhang.design.patterns.structural.decorator.demo1.decorator.AbstractDecorator;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public class DecoratorB extends AbstractDecorator {
    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation(){
        super.component.operation();
        System.out.println("执行了装饰者B的操作");
    }
}
