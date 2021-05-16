package com.zhang.design.patterns.structural.bridge;

import com.zhang.design.patterns.structural.bridge.tool.BikeTravleTool;
import com.zhang.design.patterns.structural.bridge.tool.BusTravleTool;

public class Client {


    public static void main(String[] args) {
        AbstractTravle travle = new LibraryTravle(new BikeTravleTool());
        travle = new PlaygroundTravle(new BusTravleTool());
        travle.setOut();
    }

}
