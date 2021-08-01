package com.zhang.design.patterns.creator.builder.demo4.builder;

/**
 * @author Rexxar
 * @date 2021/7/30
 */
public class WomenLovelyBuilderImpl extends AbstractWomenPersonBuilder {

    public WomenLovelyBuilderImpl(){
    }




    @Override
    public void body() {
        super.person.setBody("小巧玲珑");

    }

    @Override
    public void gender() {
        super.person.setGender(true);

    }

    @Override
    public void head() {
        super.person.setHead("小脑袋,很可爱");

    }

    @Override
    public void arms() {
        super.person.setArms("胖乎乎的小手");

    }

    @Override
    public void leg() {
        super.person.setLeg("小短腿");

    }



}
