package com.Outer;
public class outer {
    private int num =10;
    public void method(){
        class Inner{
            public void show(){
                System.out.println(num);
            }
        }

        Inner i = new Inner();
        i.show();
    }
}
