package padaria.decoradores;

import padaria.bolos.Bolo;

public class DecoradorBoloFrase extends DecoradorBolo{

    private String frase;

    public DecoradorBoloFrase(Bolo bolo, String frase) {
        super(bolo);
        this.frase = frase;
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + this.frase;
    }

}
