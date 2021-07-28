package com.zhang.design.patterns.creator.factory.method.factory.impl;

import com.zhang.design.patterns.creator.factory.method.factory.AbstracFactory;
import com.zhang.design.patterns.creator.factory.method.product.IProduct;
import com.zhang.design.patterns.creator.factory.method.product.impl.ProductOne;

public class ProductOneFactory extends AbstracFactory {
    @Override
    public IProduct creatProduct() {
        return new ProductOne();
    }
}
