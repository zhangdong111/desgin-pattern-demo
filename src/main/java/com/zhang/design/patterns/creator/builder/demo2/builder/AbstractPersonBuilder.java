package com.zhang.design.patterns.creator.builder.demo2.builder;

import com.zhang.design.patterns.creator.builder.demo2.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/29
 */
public abstract class AbstractPersonBuilder {

    Person person = new Person();


    public abstract AbstractPersonBuilder body(String body);

    public abstract AbstractPersonBuilder gender(Boolean gender);

    public abstract AbstractPersonBuilder head(String head);

    public abstract AbstractPersonBuilder arms(String arms);

    public abstract AbstractPersonBuilder leg(String leg);

    public abstract Person build();

}
