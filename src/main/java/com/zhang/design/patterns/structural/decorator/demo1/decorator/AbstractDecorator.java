package com.zhang.design.patterns.structural.decorator.demo1.decorator;

import com.zhang.design.patterns.structural.decorator.demo1.component.Component;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public abstract class AbstractDecorator implements Component {

    protected Component component;

    public AbstractDecorator(Component component) {
        this.component = component;
    }
    @Override
    public void operation(){
        if(this.component != null){
            this.component.operation();
        }
        System.out.println("执行了抽象装饰者的功能");
    }

}
