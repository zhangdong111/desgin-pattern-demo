package com.zhang.design.patterns.structural.bridge.crayon.impl;

import com.zhang.design.patterns.structural.bridge.crayon.AbstractCrayon;
import com.zhang.design.patterns.structural.bridge.color.PurpleColor;
import com.zhang.design.patterns.structural.bridge.pen.SmallPen;


public class SmallPurpleCrayon extends AbstractCrayon {

    public SmallPurpleCrayon(PurpleColor color, SmallPen pen) {
        super(color, pen);
    }

}
