package com.zhang.design.patterns.behavioral.observer.demo1.subject;

import com.zhang.design.patterns.behavioral.observer.demo1.obsever.IObserver;

/**
 * @author Rexxar
 * @date 2021/7/31
 */
public class SubjectImpl implements ISubject {

    private String status;

    public SubjectImpl() {
    }

    public void changeStatus(String staus){
        this.status = staus;
        this.notifyObservers();
    }

    public String getStatus(){
        return this.status;
    }

    public void addObserver(IObserver observer){
        this.observerList.add(observer);
    }

    public void removeObserver(IObserver observer){
        this.observerList.remove(observer);
    }

    public  void notifyObservers(){
        for (IObserver observer:this.observerList) {
            observer.update("更新");
        }
    }

}
