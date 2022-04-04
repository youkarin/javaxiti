package com.yundongyuan;

public abstract class Trainer extends human{

    public Trainer(){}
    public Trainer(String name,int age){
        super(name,age);
    }

    public abstract void teach();

}
