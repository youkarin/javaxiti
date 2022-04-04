package Bank;

import java.util.Enumeration;

public class ContoCorrente {
    //创建父类户头,数据有户头的名字,id,实现功能有存钱取钱
    private String name;
    private double money;

    public ContoCorrente(String name){
        this.name=name;
        this.money =0;
    }
    public ContoCorrente(String name, double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void addmoney(double money){
        System.out.println(name+"存了"+money);
        this.money+=money;
    };
    public void menomoney(double money){
        System.out.println(name+"取了"+money);
        this.money-=money;
    };

    @Override
    public String toString() {
        return "ContoCorrente{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
