package com.zhang.design.patterns.creator.builder.demo1;

import com.zhang.design.patterns.creator.builder.demo1.builder.AbstractCarBuidler;
import com.zhang.design.patterns.creator.builder.demo1.builder.BenChiCarModelBuidler;
import com.zhang.design.patterns.creator.builder.demo1.carmodel.AbstractCarModel;
import com.zhang.design.patterns.creator.builder.demo1.carmodel.BenChiCarModel;

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
