package com.zhang.design.patterns.creator.factory.method.factory.factory3.impl;

import com.zhang.design.patterns.creator.factory.method.factory.factory3.AbstracFactory;
import com.zhang.design.patterns.creator.factory.method.product.IProduct;
import com.zhang.design.patterns.creator.factory.method.product.impl.ProductOne;

public class ProductOneFactory extends AbstracFactory {
    @Override
    public IProduct creatProduct() {
        return new ProductOne();
    }
}
