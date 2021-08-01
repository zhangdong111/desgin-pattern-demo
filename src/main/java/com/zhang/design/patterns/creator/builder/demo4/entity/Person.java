package com.zhang.design.patterns.creator.builder.demo4.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Rexxar
 * @date 2021/7/29
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String body;

    private Boolean gender;

    private String head;

    private String arms;

    private String leg;

}
