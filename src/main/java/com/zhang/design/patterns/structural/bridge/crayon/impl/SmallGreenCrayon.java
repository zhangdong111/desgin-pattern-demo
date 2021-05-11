package com.zhang.design.patterns.structural.bridge.crayon.impl;

import com.zhang.design.patterns.structural.bridge.color.GreenColor;
import com.zhang.design.patterns.structural.bridge.crayon.AbstractCrayon;
import com.zhang.design.patterns.structural.bridge.pen.SmallPen;


public class SmallGreenCrayon extends AbstractCrayon {

    public SmallGreenCrayon(GreenColor color, SmallPen pen) {
        super(color, pen);
    }

}
