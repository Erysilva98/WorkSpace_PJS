package telefone.observador;

import telefone.view.TelaView;

public class NumeroRecenteObservador implements Observador{

    private TelaView telaView;

    public NumeroRecenteObservador(TelaView telaView) {
        this.telaView = telaView;
    }

    @Override
    public void atualizar(int numeroDiscado) {
        telaView.exibirNumeroDiscado(String.valueOf(numeroDiscado));
    }
}
