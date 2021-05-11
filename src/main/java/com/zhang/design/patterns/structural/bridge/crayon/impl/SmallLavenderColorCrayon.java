package com.zhang.design.patterns.structural.bridge.crayon.impl;

import com.zhang.design.patterns.structural.bridge.color.LavenderColor;
import com.zhang.design.patterns.structural.bridge.crayon.AbstractCrayon;
import com.zhang.design.patterns.structural.bridge.pen.SmallPen;


public class SmallLavenderColorCrayon extends AbstractCrayon {

    public SmallLavenderColorCrayon(LavenderColor color, SmallPen pen) {
        super(color, pen);
    }

}
