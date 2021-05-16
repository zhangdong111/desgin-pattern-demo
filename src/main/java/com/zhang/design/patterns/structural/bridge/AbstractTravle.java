package com.zhang.design.patterns.structural.bridge;

import com.zhang.design.patterns.structural.bridge.tool.BikeTravleTool;
import com.zhang.design.patterns.structural.bridge.tool.ITravleTool;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class AbstractTravle {

    private ITravleTool travleTool;


    private void run(){
        this.travleTool.run();
    }

    protected abstract void destination();


    public void setOut(){
        this.run();
        this.destination();
    }

}
