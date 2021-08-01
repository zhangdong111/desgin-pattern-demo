package com.zhang.design.patterns.creator.builder.demo4.builder;

import com.zhang.design.patterns.creator.builder.demo4.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/29
 */
public abstract class AbstractAManPersonBuilder implements IPersonBuilder {

    Person person = new Person();

    public final Person build(){
        this.head();
        this.body();
        this.gender();
        this.arms();
        this.leg();
        return this.person;
    };

}
