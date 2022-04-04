package com.yundongyuan;

public abstract class Runner extends human{
    public Runner() {
    }

    public Runner(String name, int age) {
        super(name, age);
    }

    public abstract void study();
}
