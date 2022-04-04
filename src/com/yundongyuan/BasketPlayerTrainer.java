package com.yundongyuan;

public class BasketPlayerTrainer extends Trainer {
    public BasketPlayerTrainer(){}
    public BasketPlayerTrainer(String name , int age){
        super(name,age);
    }
    @Override
    public void teach() {
        System.out.println("篮球教练教你打篮球");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃东西");
    }
}
