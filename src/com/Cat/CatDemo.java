package com.Cat;

public class CatDemo {
    public static void main(String[] args) {
        CatOperator co =new CatOperator();
        Cat c = new Cat();
        co.useCat(c);
        System.out.println("-----------");
        Cat c2 = co.getCat();//相当于cat c2 =new cat
        c2.eat();
        System.out.println(c.getName()+","+c2.getName());
    }
}
