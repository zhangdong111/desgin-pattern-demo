package com.zhang.design.patterns.structural.bridge.extendsmode.pen;

public abstract class AbstractPen {

    private String pen;

    protected AbstractPen(String pen) {
      this.pen = pen;
    }

    protected void getPen(){
      System.out.println(this.pen);
    }
}
