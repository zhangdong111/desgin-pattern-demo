package com.zhang.design.patterns.creator.abstracts.car.abstracts.impl;

import com.zhang.design.patterns.creator.abstracts.car.abstracts.AbstractBenChiCar;

public class BenChiSuv extends AbstractBenChiCar {

    private final static String MODEL = "SUV";

    @Override
    public String getMode() {
        return MODEL;
    }


}
