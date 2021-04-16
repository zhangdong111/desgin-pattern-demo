package com.zhang.design.patterns.creator.factory.method.factory.factory3.impl;

import com.zhang.design.patterns.creator.factory.method.factory.factory3.AbstracFactory;
import com.zhang.design.patterns.creator.factory.method.product.IProduct;
import com.zhang.design.patterns.creator.factory.method.product.impl.ProductTwo;

public class ProductTwoFactory extends AbstracFactory {
    @Override
    public IProduct creatProduct() {
        return new ProductTwo();
    }
}
