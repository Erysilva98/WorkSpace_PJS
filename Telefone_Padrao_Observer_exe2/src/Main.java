import telefone.model.TelefoneModel;
import telefone.observador.NumeroRecenteObservador;
import telefone.observador.DiscagemObservador;
import telefone.teclado.Teclado;
import telefone.view.TelaView;

public class Main {

    public static void main(String[] args) {

        final int NUM_DIGITOS = 12;

        TelefoneModel telefoneModel = new TelefoneModel();
        TelaView telaView = new TelaView();

        telefoneModel.adicionarObservador(new NumeroRecenteObservador(telaView));
        telefoneModel.adicionarObservador(new DiscagemObservador(telaView, telefoneModel)); 

        Teclado teclado = new Teclado(telefoneModel);
        teclado.simularPressionarTecla(NUM_DIGITOS);
    }
}
