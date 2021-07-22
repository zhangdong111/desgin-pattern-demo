package com.zhang.design.patterns.structural.decorator.demo3.decorator.activity.impl;

import com.zhang.design.patterns.structural.decorator.demo3.fee.IFee;
import com.zhang.design.patterns.structural.decorator.demo3.decorator.activity.AbstractActivityFee;

import java.math.BigDecimal;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public class NewUserActivityFee extends AbstractActivityFee {
    public NewUserActivityFee(IFee fee) {
        super(fee);
    }

    /**
     * 如果当前用户在新用户活动期间内成为用户,则打五折
     * @param price 价钱
     * @return 价钱
     */
    @Override
    public BigDecimal totalFee(BigDecimal price) {
        float discount = 0.5F;
        if(super.fee != null){
            price = super.fee.totalFee(price);
        }
        return price.multiply(new BigDecimal(discount)).setScale(2,BigDecimal.ROUND_CEILING);
    }
}
