package com.zhang.design.patterns.creator.builder.demo1.builder;


import com.zhang.design.patterns.creator.builder.demo1.carmodel.AbstractCarModel;
import com.zhang.design.patterns.creator.builder.demo1.carmodel.BenChiCarModel;

import java.util.List;

public class BenChiCarModelBuidler extends AbstractCarBuidler {


    private BenChiCarModel benChiCarModel = new BenChiCarModel();

    @Override
    public void setSequence(List<String> sequence) {
        this.benChiCarModel.setSequence(sequence);
    }

    @Override
    public AbstractCarModel getCarModel() {
        return this.benChiCarModel;
    }
}
