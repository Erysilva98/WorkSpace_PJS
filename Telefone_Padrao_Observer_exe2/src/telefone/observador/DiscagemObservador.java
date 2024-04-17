package telefone.observador;

import java.util.stream.Collectors;

import telefone.phone.NumeroTelefone;
import telefone.view.TelaView;

public class DiscagemObservador implements Observador{

    private TelaView telaView;
    private NumeroTelefone telefoneModel;
    private final int numeroCompleto;

    public DiscagemObservador(TelaView telaView, NumeroTelefone telefoneModel, int numeroCompleto) {
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
