package padaria.decoradores;

import padaria.bolos.Bolo;

public class DecoradorGranulado extends DecoradorBolo {

    public DecoradorGranulado(Bolo bolo) {
        super(bolo);
    }

    @Override
    public int getCustoBolo() {
        return super.getCustoBolo() + 2;  // O Granulado custa 2 reais a mais
    }

    @Override
    public String getDescricao() {

        if (super.getDescricao().contains("Com Granulado")) {
            return super.getDescricao() + " Duplo";
        }
        else{
            return super.getDescricao() + ", Com Granulado";
        }
    }

}
