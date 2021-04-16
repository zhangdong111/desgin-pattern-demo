package com.zhang.design.patterns.creator.abstracts.factory;

import com.zhang.design.patterns.creator.abstracts.car.ICar;
import com.zhang.design.patterns.creator.abstracts.car.abstracts.impl.BaoMaBusiness;
import com.zhang.design.patterns.creator.abstracts.car.abstracts.impl.BaoMaSuv;

public class BaoMaFactory implements ICarFactory {
    @Override
    public ICar createSuv() {
        return new BaoMaSuv();
    }

    @Override
    public ICar createBusiness() {
        return new BaoMaBusiness();
    }
}
