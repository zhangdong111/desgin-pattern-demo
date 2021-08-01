package com.zhang.design.patterns.creator.builder.demo4.builder;

import com.zhang.design.patterns.creator.builder.demo4.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/31
 */
public class PersonDirector {

    private AbstractWomenPersonBuilder personBuilder;

    public PersonDirector(AbstractWomenPersonBuilder personBuilder){
        this.personBuilder = personBuilder;
    }

    public Person buildPerson(){
        return this.personBuilder.build();
    }


}
