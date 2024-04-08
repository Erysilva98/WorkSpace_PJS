package telefone.observador;

import java.util.stream.Collectors;

import telefone.model.TelefoneModel;
import telefone.view.TelaView;

public class DiscagemObservador implements Observador{

    private TelaView telaView;
    private TelefoneModel telefoneModel;
    private final int numeroCompleto;

    public DiscagemObservador(TelaView telaView, TelefoneModel telefoneModel, int numeroCompleto) {
        this.telaView = telaView;
        this.telefoneModel = telefoneModel;
        this.numeroCompleto = numeroCompleto;
    }

    @Override
    public void atualizar(int numeroDiscado) {
        if (telefoneModel.getNumerosDiscados().size() == numeroCompleto) {
            // Transforma a lista de Integer em uma String sem colchetes.
            String numerosFormatados = telefoneModel.getNumerosDiscados().stream()
                    .map(String::valueOf) 
                    .collect(Collectors.joining()); 
            telaView.exibirNumeroDiscado("Agora Discando: " + numerosFormatados + "...");
        }
    }
}
