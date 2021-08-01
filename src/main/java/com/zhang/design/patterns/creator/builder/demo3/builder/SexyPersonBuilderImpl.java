package com.zhang.design.patterns.creator.builder.demo3.builder;

import com.zhang.design.patterns.creator.builder.demo3.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/30
 */
public class SexyPersonBuilderImpl extends AbstractPersonBuilder {

    public SexyPersonBuilderImpl(){
    }




    @Override
    public void body() {
        super.person.setBody("婀娜多姿");

    }

    @Override
    public void gender() {
        super.person.setGender(true);

    }

    @Override
    public void head() {
        super.person.setHead("瓜子脸,长头发");

    }

    @Override
    public void arms() {
        super.person.setArms("修长洁白的手臂");

    }

    @Override
    public void leg() {
        super.person.setLeg("大长腿");

    }

    @Override
    public Person build() {
        return super.person;
    }


}
