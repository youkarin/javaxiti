package com.jumping;

import java.util.Scanner;


public class jumpDemo {
    public static void main(String[] args) {
        jumpOpera j = new jumpOpera();
        j.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("猫会跳高了");
            }
        });

        j.method(new Jumping() {
            @Override
            public void jump() {
                System.out.println("狗会跳高了");
            }
        });

        System.out.println(Math.abs(-24));
    }


}
