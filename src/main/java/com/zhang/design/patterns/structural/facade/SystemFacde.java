package com.zhang.design.patterns.structural.facade;

/**
 * @author Rexxar
 * @date 2021/7/27
 */
public class SystemFacde {

    private final SystemOne systemOne = new SystemOne();

    private final SystemTwo systemTwo = new SystemTwo();

    private final SystemThree systemThree = new SystemThree();


    public void excuteSysOne(){
        this.systemOne.opration();
    }

    public void excuteSysTwo(){
        this.systemTwo.opration();
    }

    public void excuteSysTHree(){
        this.systemThree.opration();
    }





}
