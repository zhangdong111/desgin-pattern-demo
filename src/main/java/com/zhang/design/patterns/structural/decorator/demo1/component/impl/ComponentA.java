package com.zhang.design.patterns.structural.decorator.demo1.component.impl;

import com.zhang.design.patterns.structural.decorator.demo1.component.Component;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public class ComponentA implements Component {
    @Override
    public void operation() {
        System.out.println("执行了A的操作");
    }
}
