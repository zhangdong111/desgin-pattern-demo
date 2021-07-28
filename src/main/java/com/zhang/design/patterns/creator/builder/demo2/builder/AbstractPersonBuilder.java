package com.zhang.design.patterns.creator.builder.demo2.builder;

import com.zhang.design.patterns.creator.builder.demo2.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/29
 */
public abstract class AbstractPersonBuilder {


    protected Person builder(){
        return new Person();
    }

    protected abstract Person body(String body);

    protected abstract Person gender(Boolean gender);

    protected abstract Person head(String head);

    protected abstract Person arms(String arms);

    protected abstract Person leg(String leg);

    public abstract Person build();

}
