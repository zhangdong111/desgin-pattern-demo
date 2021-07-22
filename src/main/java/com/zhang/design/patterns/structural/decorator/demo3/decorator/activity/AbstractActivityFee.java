package com.zhang.design.patterns.structural.decorator.demo3.decorator.activity;

import com.zhang.design.patterns.structural.decorator.demo3.fee.IFee;

import java.math.BigDecimal;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public abstract   class AbstractActivityFee implements IFee {

    protected IFee fee;

    public AbstractActivityFee(IFee fee) {
        this.fee = fee;
    }


    @Override
    public BigDecimal totalFee(BigDecimal price) {
        if(this.fee != null){
            price = this.fee.totalFee(price);
        }
        return price;
    }
}
