package telefone.model;

import java.util.ArrayList;
import java.util.List;

import telefone.observador.Observador;

public class TelefoneModel {

    private List<Integer> numerosDiscados = new ArrayList<>();
    private List<Observador> observadores = new ArrayList<>();

    public void digitarNumero(int novoNumero) {
        numerosDiscados.add(novoNumero);
        notificarObservadores(novoNumero);
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    private void notificarObservadores(int novoNumero) {
        observadores.forEach(observador -> observador.atualizar(novoNumero));
    }

    public List<Integer> getNumerosDiscados() {
        return numerosDiscados;
    }
}
