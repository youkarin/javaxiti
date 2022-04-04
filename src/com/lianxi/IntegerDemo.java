package com.lianxi;

public class IntegerDemo {
    public static void main(String[] args) {
        //装箱
        Integer i =Integer.valueOf(100);
        Integer ii = 100; //自动装箱,实际还是上面的动作
        //拆箱
        // ii += 200
        ii = ii.intValue() + 200;
        ii += 200; //自动拆箱,实际还是上门的动作
    }
}
