package com.zhang.design.patterns.creator.abstracts.car.abstracts;

import com.zhang.design.patterns.creator.abstracts.car.ICar;

public abstract class AbstractDaZhongCar implements ICar {

    private static final String BAND = "大众汽车";

    @Override
    public String getBand() {
        return BAND;
    }

}
