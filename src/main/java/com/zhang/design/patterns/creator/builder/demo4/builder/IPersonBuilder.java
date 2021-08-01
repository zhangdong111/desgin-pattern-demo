package com.zhang.design.patterns.creator.builder.demo4.builder;

import com.zhang.design.patterns.creator.builder.demo4.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/31
 */
public interface IPersonBuilder {

    void body();

    void gender();

    void head();

    void arms();

    void leg();

    Person build();
}
