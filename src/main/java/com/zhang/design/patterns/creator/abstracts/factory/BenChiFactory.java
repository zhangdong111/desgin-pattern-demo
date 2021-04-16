package com.zhang.design.patterns.creator.abstracts.factory;

import com.zhang.design.patterns.creator.abstracts.car.ICar;
import com.zhang.design.patterns.creator.abstracts.car.abstracts.impl.BaoMaSuv;
import com.zhang.design.patterns.creator.abstracts.car.abstracts.impl.BenChiBusiness;
import com.zhang.design.patterns.creator.abstracts.car.abstracts.impl.BenChiSuv;

public class BenChiFactory implements ICarFactory {

    @Override
    public ICar createSuv() {
        return new BenChiSuv();
    }

    @Override
    public ICar createBusiness() {
        return new BenChiBusiness();
    }
}
