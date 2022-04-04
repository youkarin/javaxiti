package com.yundongyuan;
/*
有乒乓球运动员和篮球运动员,乒乓球教练和篮球教练.
现在跟乒乓球有关的人都需要学英语
请分析有哪些具体类,哪些抽象类,哪些接口
分析方法,从具体到抽象

乒乓球运动员->篮球运动员->乒乓球教练->篮球教练
全是具体类
抽象类:运动员类  方法:学习();
抽象类:教练类    方法:教学();
抽象类: 人      姓名 年龄   方法:吃饭()    假设两种人吃的不一样
接口:学习英语

实现:从抽象到具体
 */
public class RunnerDemo {
    public static void main(String[] args) {
        BasketPlayer bp =new BasketPlayer("张三",12);
        BasketPlayerTrainer bpt = new BasketPlayerTrainer("张三教练",44);

        Pingpong pp =new Pingpong("李四",12);
        PingpongTrainer ppt= new PingpongTrainer("李四教练",34);

        System.out.println(bp.getName()+bp.getAge());
        bp.study();bp.eat();

        pp.studyEng();
    }


}
