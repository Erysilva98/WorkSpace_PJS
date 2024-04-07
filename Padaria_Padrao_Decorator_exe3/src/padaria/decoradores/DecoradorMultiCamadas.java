package padaria.decoradores;

import padaria.bolos.Bolo;

public class DecoradorMultiCamadas extends DecoradorBolo{

    public DecoradorMultiCamadas(Bolo bolo) {
        super(bolo);
    }

    @Override
    public int getCustoBolo() {
        return bolo.getCustoBolo() + 5; // O Bolo de MultiCamadas custa 5 a mais que o bolo base
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " Multi-Camadas";
    }
}
