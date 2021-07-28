package com.zhang.design.patterns.creator.factory.method;

import com.zhang.design.patterns.creator.factory.method.factory.impl.ProductOneFactory;
import com.zhang.design.patterns.creator.factory.method.product.IProduct;

/**
 * @author Rexxar
 * @date 2021/7/25
 */
public class Client {

    public static void main(String[] args) {
        IProduct product = new ProductOneFactory().creatProduct();
    }

}
