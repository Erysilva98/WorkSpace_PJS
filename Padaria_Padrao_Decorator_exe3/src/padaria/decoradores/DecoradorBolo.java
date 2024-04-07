package padaria.decoradores;

import padaria.bolos.Bolo;

public abstract class DecoradorBolo extends Bolo {
    protected Bolo bolo;

    public DecoradorBolo(Bolo bolo) {
        this.bolo = bolo;
    }

    @Override
    public String getDescricao() {
        return bolo.getDescricao();
    }

    @Override
    public int getCustoBolo() {
        return bolo.getCustoBolo();
    }
}
