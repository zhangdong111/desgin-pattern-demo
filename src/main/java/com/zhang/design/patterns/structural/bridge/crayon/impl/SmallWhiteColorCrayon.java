package com.zhang.design.patterns.structural.bridge.crayon.impl;

import com.zhang.design.patterns.structural.bridge.crayon.AbstractCrayon;
import com.zhang.design.patterns.structural.bridge.color.WhiteColor;
import com.zhang.design.patterns.structural.bridge.pen.SmallPen;


public class SmallWhiteColorCrayon extends AbstractCrayon {

    public SmallWhiteColorCrayon(WhiteColor color, SmallPen pen) {
        super(color, pen);
    }

}
