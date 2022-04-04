package ex2;

public class Stagista extends Impiegato{
    //记录人数和实习时间
    private int numeroPresenze;
    private int numeroIdentificativoStage;

    public Stagista(){}
    public Stagista(String nome, String date) {
        super(nome, date);
    }


    public int getNumeroPresenze() {
        return numeroPresenze;
    }

    public void setNumeroPresenze(int numeroPresenze) {
        this.numeroPresenze = numeroPresenze;
    }

    public int getNumeroIdentificativoStage() {
        return numeroIdentificativoStage;
    }

    public void setNumeroIdentificativoStage(int numeroIdentificativoStage) {
        this.numeroIdentificativoStage = numeroIdentificativoStage;
    }


}
