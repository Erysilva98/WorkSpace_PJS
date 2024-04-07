package componente;

import java.util.ArrayList;
import java.util.List;

public class CompositeParteCarro implements Componente {
    private List<Componente> componentes = new ArrayList<>();
    private String nome;
    private double pesoBase;

    public CompositeParteCarro(String nome, double pesoBase) {
        this.nome = nome;
        this.pesoBase = pesoBase;
    }

    @Override
    public double getPeso() {
        double totalPeso = pesoBase;
        for (Componente comp : componentes) {
            totalPeso += comp.getPeso();
        }
        System.out.println("\n Total parcial para " + nome + ": " + totalPeso + "kg \n");
        return totalPeso;
    }

    @Override
    public void adicionar(Componente componente) {
        componentes.add(componente);
    }

    @Override
    public void remover(Componente componente) {
        componentes.remove(componente);
    }

    @Override
    public String getNome() {
        return nome;
    }
}
