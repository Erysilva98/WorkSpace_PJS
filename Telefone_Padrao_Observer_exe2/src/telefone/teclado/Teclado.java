package telefone.teclado;

import telefone.model.TelefoneModel;
import java.util.Random;

public class Teclado {

    private final TelefoneModel telefoneModel;

    public Teclado(TelefoneModel telefoneModel) {
        this.telefoneModel = telefoneModel;
    }

    public void simularPressionarTecla(int numeroPressionado) {
        final int MAX_DIGITO = 7;

        Random random = new Random();

        for (int i = 0; i <numeroPressionado; i++) {
            int novoNumero = random.nextInt(MAX_DIGITO + 1);
            
            System.out.println("Pressionando tecla: " + novoNumero);
            telefoneModel.digitarNumero(novoNumero);
        }
        
    }

}
