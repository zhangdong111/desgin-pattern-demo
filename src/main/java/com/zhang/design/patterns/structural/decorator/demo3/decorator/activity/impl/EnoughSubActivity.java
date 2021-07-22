package com.zhang.design.patterns.structural.decorator.demo3.decorator.activity.impl;

import com.zhang.design.patterns.structural.decorator.demo3.fee.IFee;
import com.zhang.design.patterns.structural.decorator.demo3.decorator.activity.AbstractActivityFee;

import java.math.BigDecimal;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public class EnoughSubActivity extends AbstractActivityFee {
    public EnoughSubActivity(IFee fee) {
        super(fee);
    }

    /**
     * 如果当前用户价格满到200元,减50
     * @param price 价钱
     * @return 价钱
     */
    @Override
    public BigDecimal totalFee(BigDecimal price) {
        float enoughPrice = 200.00F;
        float subPrice = 50.00F;
        if(super.fee != null){
            price = super.fee.totalFee(price);
        }
        if(price.compareTo(new BigDecimal(enoughPrice)) > 0){
            price = price.subtract(new BigDecimal(subPrice)).setScale(2,BigDecimal.ROUND_CEILING);
        }
        return price;
    }

}
