package padaria.bolos;

public class BoloMorango extends Bolo{

    public int getCustoBolo() {
        return super.getCustoBolo() * 2;  // O Bolo de Morango custa o dobro do preço base
    }

    @Override
    public String getDescricao() {
        return "Bolo de Morango";
    }

}
