package Bank;

public class BankDemo {
    public static void main(String[] args) {
        ContoCorrente c1 = new ContoCorrente("张三");
        System.out.println(c1.toString());
        c1.addmoney(26.3);
        System.out.println(c1.toString());

        ContoCorrente c2 =new ContoCorrente("李四",39.9);
        System.out.println(c2.toString());

        dollarConto d2=new dollarConto(c1.getName(),22.2);
        System.out.println(d2.toString());

        dollarConto d1 = new dollarConto("王五",29,23.3);
        System.out.println(d1.toString());
    }
}
