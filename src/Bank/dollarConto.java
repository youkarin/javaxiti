package Bank;

public class dollarConto extends ContoCorrente{
    private double dollar;

    public dollarConto(String name){
        super(name);
        this.dollar = 0;
    }
    public dollarConto(String name, double dollar) {
        super(name);
        this.dollar = dollar;
    }

    public dollarConto(String name, double money, double dollar) {
        super(name, money);
        this.dollar = dollar;
    }

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }

    public void addmoney(double dollar){
        this.dollar+=dollar;
    }
    public void menomoney(double dollar){
        this.dollar-=dollar;
    }

    @Override
    public String toString() {
        return getName()+"  "+getDollar()+"  "+getMoney();
    }
}
