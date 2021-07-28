package com.zhang.design.patterns.creator.builder.demo1.builder;

import com.zhang.design.patterns.creator.builder.demo1.carmodel.AbstractCarModel;
import com.zhang.design.patterns.creator.builder.demo1.carmodel.BenChiCarModel;

import java.util.List;

public abstract class AbstractCarBuidler {

    protected BenChiCarModel benChiCarModel;

    public abstract  void setSequence(List<String> sequence);

    public abstract  AbstractCarModel getCarModel();

}
