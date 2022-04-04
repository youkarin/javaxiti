    package com.Cat;

    public class CatOperator {
        public void useCat(Cat c){
            c.eat();
        }
        public  Cat getCat(){
            Cat c = new Cat();
            c.setName("小猫咪");
            return c;
        }
    }
