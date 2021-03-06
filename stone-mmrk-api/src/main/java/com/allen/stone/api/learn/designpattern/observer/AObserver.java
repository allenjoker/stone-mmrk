package com.allen.stone.api.learn.designpattern.observer;

/**
 * @Author Allen
 * @Description
 * @Date 2018/11/3 23:04
 **/
public class AObserver extends Observer {

    public AObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "A String: " +  subject.getState());
    }
}
