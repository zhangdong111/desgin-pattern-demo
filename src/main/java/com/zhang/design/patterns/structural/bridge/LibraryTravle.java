package com.zhang.design.patterns.structural.bridge;

import com.zhang.design.patterns.structural.bridge.tool.BikeTravleTool;

public class LibraryTravle extends AbstractTravle {

    public LibraryTravle(BikeTravleTool travleTool) {
        super(travleTool);
    }

    @Override
    protected void destination() {
        System.out.println("目的地图书管...");
    }
}
