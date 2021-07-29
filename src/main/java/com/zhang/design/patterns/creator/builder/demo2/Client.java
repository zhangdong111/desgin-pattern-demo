package com.zhang.design.patterns.creator.builder.demo2;

import com.zhang.design.patterns.creator.builder.demo2.builder.AbstractPersonBuilder;
import com.zhang.design.patterns.creator.builder.demo2.builder.SimplePersonBuilderImpl;
import com.zhang.design.patterns.creator.builder.demo2.entity.Person;

/**
 * @author Rexxar
 * @date 2021/7/30
 */
public class Client {
    public static void main(String[] args) {

        Person person = SimplePersonBuilderImpl.builder()
                .body("完美比例")
                .gender(true)
                .arms("修长的胳膊")
                .head("漂亮的脸")
                .leg("大长白腿")
                .build();
        System.out.println(person.toString());

    }

}
