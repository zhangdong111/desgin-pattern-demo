package com.zhang.design.patterns.creator.builder.demo3.builder;

import com.zhang.design.patterns.creator.builder.demo3.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/31
 */
public class PersonDirector {

    private AbstractPersonBuilder personBuilder;

    public PersonDirector(AbstractPersonBuilder personBuilder){
        this.personBuilder = personBuilder;
    }

    public Person buildPerson(){
        this.personBuilder.body();
        this.personBuilder.arms();
        this.personBuilder.gender();
        this.personBuilder.head();
        this.personBuilder.leg();
        return this.personBuilder.build();
    }


}
