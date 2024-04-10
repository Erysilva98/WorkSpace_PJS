package componente;

import java.util.ArrayList;
import java.util.List;

public class ComponenteParteCarro implements IComponente {
    private List<Componente> componentes = new ArrayList<>();
    private String nome;
    private double pesoBase;

    public ComponenteParteCarro(String nome, double pesoBase) {
        this.nome = nome;
        this.pesoBase = pesoBase;
    }

    @Override
    public double getPeso() {
        // Calcula o peso total dos componentes internos
        double pesoComponentes = componentes.stream().mapToDouble(Componente::getPeso).sum();
        // Imprime o peso parcial antes de retornar o total
        System.out.println("\n Peso parcial para " + nome + ": " + (pesoBase + pesoComponentes) + "kg");
        return pesoBase + pesoComponentes;
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
