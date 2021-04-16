package com.zhang.design.patterns.creator.abstracts.car.abstracts.impl;

import com.zhang.design.patterns.creator.abstracts.car.abstracts.AbstractDaZhongCar;

public class DaZhongSuv extends AbstractDaZhongCar {

    private static final String MODE = "SUV";

    @Override
    public String getMode() {
        return MODE;
    }
}
