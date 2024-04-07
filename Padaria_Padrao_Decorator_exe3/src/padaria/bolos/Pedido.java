package padaria.bolos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final List<Bolo> bolos = new ArrayList<>();

    public void adicionarBolo(Bolo bolo) {
        bolos.add(bolo);
    }

    public void imprimirPedido() {
        for (Bolo bolo : bolos) {
            System.out.printf(" %2d %s\n", bolo.getCustoBolo(), bolo.getDescricao());
        }
    }
}
