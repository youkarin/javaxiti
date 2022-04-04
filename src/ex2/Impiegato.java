package ex2;

public class Impiegato extends person{
    private double salary;

    public Impiegato(){}
    public Impiegato(String nome,String date){
        super(nome,date);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
