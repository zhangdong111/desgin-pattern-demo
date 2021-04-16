package com.zhang.design.patterns.creator.factory.method.factory;

import com.zhang.design.patterns.creator.factory.method.product.IProduct;

public class ProductFactory {


    public <T extends IProduct> T createProduct(Class<T> c){
        IProduct product = null;
        try{
            product = (T)Class.forName(c.getName()).newInstance();
            return (T)product;
        }catch (Exception e){
            return null;
        }
    }


}
