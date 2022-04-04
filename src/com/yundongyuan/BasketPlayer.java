package com.yundongyuan;

public class BasketPlayer extends Runner {

    public BasketPlayer() {
    }

    public BasketPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃东西");
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学习+训练");
    }
}
