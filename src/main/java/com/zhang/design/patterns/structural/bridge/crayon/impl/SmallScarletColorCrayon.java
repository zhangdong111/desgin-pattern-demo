package com.zhang.design.patterns.structural.bridge.crayon.impl;

import com.zhang.design.patterns.structural.bridge.crayon.AbstractCrayon;
import com.zhang.design.patterns.structural.bridge.color.ScarletColor;
import com.zhang.design.patterns.structural.bridge.pen.SmallPen;


public class SmallScarletColorCrayon extends AbstractCrayon {

    public SmallScarletColorCrayon(ScarletColor color, SmallPen pen) {
        super(color, pen);
    }

}
