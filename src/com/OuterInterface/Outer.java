package com.OuterInterface;

public class Outer {
    public void method(){
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        }.show();

        //也可以这么写
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        };

        i.show();
    }
}
