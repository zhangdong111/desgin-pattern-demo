package com.zhang.design.patterns.structural.bridge.crayon.impl;

import com.zhang.design.patterns.structural.bridge.color.RedColor;
import com.zhang.design.patterns.structural.bridge.crayon.AbstractCrayon;
import com.zhang.design.patterns.structural.bridge.pen.SmallPen;


public class SmallRedCrayon extends AbstractCrayon {

    public SmallRedCrayon(RedColor color, SmallPen pen) {
        super(color, pen);
    }

}
