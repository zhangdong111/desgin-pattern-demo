package com.zhang.design.patterns.creator.abstracts.car.abstracts.impl;

import com.zhang.design.patterns.creator.abstracts.car.abstracts.AbstractBenChiCar;

public class BenChiBusiness extends AbstractBenChiCar{

    private static final String MODEL = "商务车";


    @Override
    public String getMode() {
        return MODEL;
    }
}
