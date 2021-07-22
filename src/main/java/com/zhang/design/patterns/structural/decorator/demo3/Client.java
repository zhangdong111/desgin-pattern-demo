package com.zhang.design.patterns.structural.decorator.demo3;

import com.zhang.design.patterns.structural.decorator.demo3.decorator.activity.impl.EnoughSubActivity;
import com.zhang.design.patterns.structural.decorator.demo3.decorator.activity.impl.NewUserActivityFee;
import com.zhang.design.patterns.structural.decorator.demo3.fee.IFee;
import com.zhang.design.patterns.structural.decorator.demo3.fee.impl.NormalFee;
import com.zhang.design.patterns.structural.decorator.demo3.fee.impl.VipFee;
import sun.rmi.runtime.NewThreadAction;

import java.math.BigDecimal;

/**
 * @author Rexxar
 * @date 2021/7/23
 */
public class Client {

    public static void main(String[] args) {

        IFee fee = new NormalFee();
        fee = new NewUserActivityFee(fee);
        fee = new EnoughSubActivity(fee);
        BigDecimal activityFee = fee.totalFee(new BigDecimal(300.00F));
        System.out.println("初始价钱为300元,正常用户参加了新用户注册活动,满减活动,最后付费价格是:" + activityFee.toString());

        IFee fee2 = new VipFee();
        fee2 = new EnoughSubActivity(fee2);
        BigDecimal vipFee = fee2.totalFee(new BigDecimal(300.00F));
        System.out.println("初始价钱为300元,vip用户,参加了满减活动,最后的付费价格是:" + vipFee.toString());


        IFee fee3 = new NormalFee();
        BigDecimal normalFee = fee3.totalFee(new BigDecimal(300.00F));
        System.out.println("初始价钱为300元,正常用户最后付费价格是:" + normalFee.toString());
    }

}
