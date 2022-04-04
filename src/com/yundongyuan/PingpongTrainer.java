package com.yundongyuan;

public class PingpongTrainer extends Trainer implements studyEnglish{

    public PingpongTrainer(){}
    public PingpongTrainer(String name,int age){
        super(name,age);
    }
    @Override
    public void teach() {
        System.out.println("教练教你打乒乓");
    }

    @Override
    public void eat() {
        System.out.println("乒乓教练吃东西");
    }

    @Override
    public void studyEng() {
        System.out.println("乒乓教练学英语");
    }
}
