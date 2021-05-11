package com.zhang.design.patterns.structural.bridge.crayon.impl;

import com.zhang.design.patterns.structural.bridge.color.PinkColor;
import com.zhang.design.patterns.structural.bridge.crayon.AbstractCrayon;
import com.zhang.design.patterns.structural.bridge.pen.SmallPen;


public class SmallPinkCrayon extends AbstractCrayon {

    public SmallPinkCrayon(PinkColor color, SmallPen pen) {
        super(color, pen);
    }

}
