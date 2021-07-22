package com.zhang.design.patterns.structural.decorator.demo2;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public class DecoratorA extends ConcreteComponent {

    private ConcreteComponent concreteComponent;

    public DecoratorA(ConcreteComponent concreteComponent) {
        this.concreteComponent = concreteComponent;
    }

    @Override
    public void opreation(){
         if(concreteComponent != null){
             this.concreteComponent.opreation();
         }
        System.out.println("执行自己的操作");
    }

}
