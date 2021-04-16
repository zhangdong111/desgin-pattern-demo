package com.zhang.design.patterns.creator.builder.carmodel;

import java.util.List;

public abstract class AbstractCarModel {

    public static final String START = "start";

    public static final String STOP = "stop";

    public static final String ALARM = "alarm";

    protected void start(){ System.out.println("汽车启动了...."); }

    protected void stop(){
        System.out.println("汽车停止了....");
    }

    protected void alarm(){
        System.out.println("汽车鸣笛了....");
    }

    public abstract void setSequence(List<String> sequence);

    public abstract void run();

}
