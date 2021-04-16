package com.zhang.design.patterns.creator.builder.builder;

import com.zhang.design.patterns.creator.builder.carmodel.AbstractCarModel;
import com.zhang.design.patterns.creator.builder.carmodel.BenChiCarModel;

import java.util.List;

public abstract class AbstractCarBuidler {

    protected BenChiCarModel benChiCarModel;

    public abstract  void setSequence(List<String> sequence);

    public abstract  AbstractCarModel getCarModel();

}
