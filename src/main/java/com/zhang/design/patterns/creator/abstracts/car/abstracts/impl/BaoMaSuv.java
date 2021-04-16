package com.zhang.design.patterns.creator.abstracts.car.abstracts.impl;

import com.zhang.design.patterns.creator.abstracts.car.abstracts.AbstractBaoMaCar;
import com.zhang.design.patterns.creator.abstracts.car.abstracts.AbstractBenChiCar;

public class BaoMaSuv extends AbstractBaoMaCar {

    private final static String MODEL = "SUV";

    @Override
    public String getMode() {
        return MODEL;
    }


}
