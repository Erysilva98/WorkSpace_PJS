package telefone.observador;

import telefone.model.TelefoneModel;
import telefone.view.TelaView;

public class DiscagemObservador implements Observador{

    private TelaView telaView;
    private TelefoneModel telefoneModel;

    public DiscagemObservador(TelaView telaView, TelefoneModel telefoneModel) {
        this.telaView = telaView;
        this.telefoneModel = telefoneModel;
    }

    @Override
    public void atualizar(int numeroDiscado) {
        telaView.exibirNumeroDiscado("Agora discando: 87 9" + telefoneModel.getNumerosDiscados().toString() + "...");
    }
}
