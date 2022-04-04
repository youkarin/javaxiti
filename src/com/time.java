package com;

public class time {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
