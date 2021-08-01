package com.zhang.design.patterns.creator.builder.demo4;

import com.zhang.design.patterns.creator.builder.demo4.builder.PersonDirector;
import com.zhang.design.patterns.creator.builder.demo4.builder.WomenSexyBuilderImpl;
import com.zhang.design.patterns.creator.builder.demo4.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/31
 */
public class Client {

    public static void main(String[] args) {
        PersonDirector director = new PersonDirector(new WomenSexyBuilderImpl());
        Person person = director.buildPerson();
        System.out.println(person);
    }

}
