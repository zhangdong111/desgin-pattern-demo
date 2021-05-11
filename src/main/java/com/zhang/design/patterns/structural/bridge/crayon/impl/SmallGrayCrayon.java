package com.zhang.design.patterns.structural.bridge.crayon.impl;

import com.zhang.design.patterns.structural.bridge.crayon.AbstractCrayon;
import com.zhang.design.patterns.structural.bridge.color.GrayColor;
import com.zhang.design.patterns.structural.bridge.pen.SmallPen;


public class SmallGrayCrayon extends AbstractCrayon {

    public SmallGrayCrayon(GrayColor color, SmallPen pen) {
        super(color, pen);
    }

}
