package com.zhang.design.patterns.structural.bridge.crayon;

import com.zhang.design.patterns.structural.bridge.color.AbstractColor;
import com.zhang.design.patterns.structural.bridge.pen.AbstractPen;

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
