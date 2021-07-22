package com.zhang.design.patterns.structural.decorator.demo3.fee;

import java.math.BigDecimal;

/**
 * @author Rexxar
 * @date 2021/7/22
 */
public interface IFee {

    /**
     * 账单总共的钱数
     * @param price 传入的钱数
     * @return 结账的钱数
     */
    BigDecimal totalFee(BigDecimal price);

}
