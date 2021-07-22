package com.zhang.design.patterns.structural.decorator.demo3.fee.impl;

import com.zhang.design.patterns.structural.decorator.demo3.fee.IFee;

import java.math.BigDecimal;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public class VipFee implements IFee {

    /**
     * 会员打八折
     * @param price 传入的钱数
     * @return 结账价钱
     */
    @Override
    public BigDecimal totalFee(BigDecimal price) {
        float discount = 0.8F;
        return price.multiply(new BigDecimal(discount)).setScale(2,BigDecimal.ROUND_CEILING);
    }
}
