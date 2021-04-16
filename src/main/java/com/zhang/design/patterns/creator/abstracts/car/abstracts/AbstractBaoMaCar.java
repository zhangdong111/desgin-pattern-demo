package com.zhang.design.patterns.creator.abstracts.car.abstracts;

import com.zhang.design.patterns.creator.abstracts.car.ICar;

public abstract class AbstractBaoMaCar implements ICar {

    private final static String BAND = "奔驰汽车";

    @Override
    public String getBand(){
        return BAND;
    }

}
