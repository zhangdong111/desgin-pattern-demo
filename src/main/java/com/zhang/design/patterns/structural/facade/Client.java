package com.zhang.design.patterns.structural.facade;

/**
 * @author Rexxar
 * @date 2021/7/27
 */
public class Client {

    public static void main(String[] args) {
        SystemFacde facde = new SystemFacde();
        facde.excuteSysOne();
        facde.excuteSysTwo();
        facde.excuteSysTHree();
    }
}
