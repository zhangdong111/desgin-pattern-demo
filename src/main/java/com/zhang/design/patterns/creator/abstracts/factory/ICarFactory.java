package com.zhang.design.patterns.creator.abstracts.factory;

import com.zhang.design.patterns.creator.abstracts.car.ICar;

public interface ICarFactory {

    ICar createSuv();

    ICar createBusiness();
}
