package com.zhang.design.patterns.structural.bridge.extendsmode.crayon;

import com.zhang.design.patterns.structural.bridge.extendsmode.color.AbstractColor;
import com.zhang.design.patterns.structural.bridge.extendsmode.pen.AbstractPen;

public abstract  class AbstractCrayon {

    private AbstractColor color;

    private AbstractPen pen;

    protected AbstractCrayon(AbstractColor color, AbstractPen pen) {
        this.color = color;
        this.pen = pen;
    }

    @Override
    public String toString() {
        return "AbstractCrayon{" +
                "color=" + color +
                ", pen=" + pen +
                '}';
    }
}
