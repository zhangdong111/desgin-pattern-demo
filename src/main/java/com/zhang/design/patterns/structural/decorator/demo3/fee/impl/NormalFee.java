package com.zhang.design.patterns.structural.decorator.demo3.fee.impl;

import com.zhang.design.patterns.structural.decorator.demo3.fee.IFee;

import java.math.BigDecimal;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public class NormalFee implements IFee {
    @Override
    public BigDecimal totalFee(BigDecimal price) {
        return price;
    }
}
