package com.zhang.design.patterns.creator.builder.demo2.builder;

import com.zhang.design.patterns.creator.builder.demo2.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/30
 */
public class SimplePersonBuilderImpl extends  AbstractPersonBuilder {

    private SimplePersonBuilderImpl(){
    }


    public static AbstractPersonBuilder builder() {
        return new SimplePersonBuilderImpl();
    }

    @Override
    public AbstractPersonBuilder body(String body) {
        super.person.setBody(body);
        return this;
    }

    @Override
    public AbstractPersonBuilder gender(Boolean gender) {
        super.person.setGender(gender);
        return this;
    }

    @Override
    public AbstractPersonBuilder head(String head) {
        super.person.setHead(head);
        return this;
    }

    @Override
    public AbstractPersonBuilder arms(String arms) {
        super.person.setArms(arms);
        return this;
    }

    @Override
    public AbstractPersonBuilder leg(String leg) {
        super.person.setLeg(leg);
        return this;
    }

    @Override
    public Person build() {
        return this.person;
    }


}
