package com.zhang.design.patterns.creator.simple.factory;

import com.zhang.design.patterns.creator.simple.factory.product.IProduct;

public class SimpleFactory {

    public static <T extends IProduct> T createProduct(Class<T> c){
        try{
            IProduct  product = (T)Class.forName(c.getName()).newInstance();
            return (T)product;
        }catch (Exception e){
            return null;
        }

    }

}
