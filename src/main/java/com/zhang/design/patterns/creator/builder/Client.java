package com.zhang.design.patterns.creator.builder;

import com.zhang.design.patterns.creator.builder.builder.AbstractCarBuidler;
import com.zhang.design.patterns.creator.builder.builder.BenChiCarModelBuidler;
import com.zhang.design.patterns.creator.builder.carmodel.AbstractCarModel;
import com.zhang.design.patterns.creator.builder.carmodel.BenChiCarModel;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        AbstractCarBuidler buidler = new BenChiCarModelBuidler();
        List<String> sequence = new ArrayList<>();
        sequence.add(AbstractCarModel.START);
        sequence.add(AbstractCarModel.ALARM);
        sequence.add(AbstractCarModel.STOP);
        buidler.setSequence(sequence);
        BenChiCarModel model = (BenChiCarModel)buidler.getCarModel();
        System.out.println(model.getSequence().toString());
        model.run();
    }
}
