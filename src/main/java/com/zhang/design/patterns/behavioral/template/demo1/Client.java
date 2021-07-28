package com.zhang.design.patterns.behavioral.template.demo1;

/**
 * @author Rexxar
 * @date 2021/7/25
 */
public class Client {

    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.excute();
    }

}
