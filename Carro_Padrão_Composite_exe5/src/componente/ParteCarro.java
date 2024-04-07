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
        System.out.println("Peso componente " + nome + ": " + peso + " kg");
        return peso;
    }

    @Override
    public void adicionar(Componente componente) {
        throw new UnsupportedOperationException("Não é possível adicionar componentes a '" + nome + " por falta de dados.");
    }

    @Override
    public void remover(Componente componente) {
        throw new UnsupportedOperationException("Não é possível remover componentes de '" + nome + " por que não foi encontrado.");
    }

    @Override
    public String getNome() {
        return nome;
    }
}
