package com.zhang.design.patterns.structural.bridge.crayon.impl;

import com.zhang.design.patterns.structural.bridge.color.PansyColor;
import com.zhang.design.patterns.structural.bridge.crayon.AbstractCrayon;
import com.zhang.design.patterns.structural.bridge.pen.SmallPen;


public class SmallPansyCrayon extends AbstractCrayon {

    public SmallPansyCrayon(PansyColor color, SmallPen pen) {
        super(color, pen);
    }

}
