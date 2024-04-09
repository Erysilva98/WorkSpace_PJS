package componente;

public class ParteCarro implements Componente {
    private String nome;
    private double peso;

    public ParteCarro(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public double getPeso() {
        return peso;
    }

    @Override
    public String getNome() {
        return nome;
    }
}
