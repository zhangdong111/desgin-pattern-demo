package com.zhang.design.patterns.structural.bridge;

import com.zhang.design.patterns.creator.abstracts.car.abstracts.AbstractBaoMaCar;
import com.zhang.design.patterns.structural.bridge.tool.BusTravleTool;
import com.zhang.design.patterns.structural.bridge.tool.CarTravleTool;
import com.zhang.design.patterns.structural.bridge.tool.ITravleTool;

public class PlaygroundTravle extends AbstractTravle {

    public PlaygroundTravle(BusTravleTool travleTool) {
        super(travleTool);
    }

    @Override
    protected void destination() {
        System.out.println("游乐场...");
    }
}
