package com.zhang.design.patterns.creator.abstracts.car.abstracts;

import com.zhang.design.patterns.creator.abstracts.car.ICar;



public abstract  class AbstractBenChiCar implements ICar {
    private final static String BAND = "宝马汽车";

    @Override
    public String getBand(){
        return BAND;
    }
}
