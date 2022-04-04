package com.yundongyuan;

public class Pingpong extends Runner implements studyEnglish{

    public Pingpong() {
    }

    public Pingpong(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("乒乓运动员吃食物");
    }
    @Override
    public void study(){
        System.out.println("乒乓运动员学习+训练");
    }

    @Override
    public void studyEng() {
        System.out.println("乒乓运动员学英语");
    }
}
