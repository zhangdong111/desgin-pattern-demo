package com.zhang.design.patterns.creator.builder.demo3;

import com.zhang.design.patterns.creator.builder.demo3.builder.PersonDirector;
import com.zhang.design.patterns.creator.builder.demo3.builder.SexyPersonBuilderImpl;
import com.zhang.design.patterns.creator.builder.demo3.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/31
 */
public class Client {

    public static void main(String[] args) {
        PersonDirector director = new PersonDirector(new SexyPersonBuilderImpl());
        Person person = director.buildPerson();
        System.out.println(person);
    }

}
