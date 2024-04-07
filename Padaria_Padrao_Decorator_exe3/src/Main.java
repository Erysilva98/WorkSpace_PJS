
import padaria.bolos.BoloChocolate;
import padaria.bolos.BoloBaunilha;
import padaria.bolos.BoloMorango;

import padaria.decoradores.DecoradorBoloFrase;
import padaria.decoradores.DecoradorGranulado;
import padaria.decoradores.DecoradorMultiCamadas;
import padaria.bolos.Pedido;

public class Main {

    public static void main(String[] args) {
        
        Pedido pedido = new Pedido();
        pedido.adicionarBolo(
            new BoloChocolate()
        );
        pedido.adicionarBolo(
            new DecoradorBoloFrase(
                new BoloBaunilha(), " PLAIN! "
            )
        );
        pedido.adicionarBolo(
            new DecoradorBoloFrase(
                new DecoradorGranulado(
                    new BoloBaunilha()
                ), " FANCY! "
            )
        );

        pedido.adicionarBolo(new DecoradorBoloFrase(
            new DecoradorBoloFrase(
                new DecoradorGranulado(
                    new DecoradorGranulado(
                        new DecoradorMultiCamadas(
                            new BoloMorango()
                    )
                )
            ), " One of é "
        ), "EVERYTHING "));

        pedido.imprimirPedido();

    }
}
