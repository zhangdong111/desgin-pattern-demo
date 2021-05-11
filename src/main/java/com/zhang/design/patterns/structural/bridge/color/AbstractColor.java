package com.zhang.design.patterns.structural.bridge.color;

public abstract class AbstractColor {

    private String color;

    protected AbstractColor(String color) {
        this.color = color;
    }

    protected void getColor(){
        System.out.println(this.color);
    }

}
