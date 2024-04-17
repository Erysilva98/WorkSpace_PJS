import telefone.observador.NumeroRecenteObservador;
import telefone.phone.NumeroTelefone;
import telefone.observador.DiscagemObservador;
import telefone.teclado.Teclado;
import telefone.view.TelaView;

public class Main {

    public static void main(String[] args) {

        final int NUM_DIGITOS = 11;

        NumeroTelefone discarNumeroTelefone = new NumeroTelefone();
        TelaView telaView = new TelaView();

        discarNumeroTelefone.adicionarObservador(new NumeroRecenteObservador(telaView));
        discarNumeroTelefone.adicionarObservador(new DiscagemObservador(telaView, discarNumeroTelefone, NUM_DIGITOS)); 

        Teclado teclado = new Teclado(discarNumeroTelefone);
        teclado.simularPressionarTecla(NUM_DIGITOS);
    }
}
