package ex2;

public class person {
    private String nome;
    private String date;

    public  person(){}
    public person(String nome, String date) {
        this.nome = nome;
        this.date = date;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
