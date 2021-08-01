package com.zhang.design.patterns.creator.builder.demo3.builder;

import com.zhang.design.patterns.creator.builder.demo3.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/29
 */
public abstract class AbstractPersonBuilder {

    Person person = new Person();


    public abstract void body();

    public abstract void gender();

    public abstract void head();

    public abstract void arms();

    public abstract void leg();

    public abstract Person build();

}
