package com.zhang.design.patterns.creator.factory.method.factory;

import com.zhang.design.patterns.creator.factory.method.product.IProduct;
import com.zhang.design.patterns.creator.factory.method.product.impl.ProductOne;
import com.zhang.design.patterns.creator.factory.method.product.impl.ProductTwo;

public class ProductFactory2 {


    public IProduct creatProduct(String productType){
        try{
            IProduct product = null;
            if(productType.equals("type1")){
                product = new ProductOne();
            }
            if(productType.equals("type2")){
                product = new ProductTwo();
            }
            return product;
        }catch (Exception e){
            return null;
        }

    }

}
