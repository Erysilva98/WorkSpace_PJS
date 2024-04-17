package telefone.teclado;

import java.util.Random;

import telefone.phone.NumeroTelefone;

public class Teclado {

    private final NumeroTelefone discarNumeroTelefone;

    public Teclado(NumeroTelefone discarNumeroTelefone) {
        this.discarNumeroTelefone = discarNumeroTelefone;
    }

    public void simularPressionarTecla(int numeroPressionado) {
        final int MAX_DIGITO = 7;

        Random random = new Random();

        for (int i = 0; i <numeroPressionado; i++) {
            int novoNumero = random.nextInt(MAX_DIGITO + 1);
            
            System.out.println("Pressionando tecla: " + novoNumero);
            discarNumeroTelefone.digitarNumero(novoNumero);
        }
        
    }

}
