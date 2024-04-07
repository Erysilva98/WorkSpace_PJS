package padaria.bolos;

public abstract class Bolo {
    
    private final int CustoBolo = 10;

    public int getCustoBolo() {
        return CustoBolo;
    }

    public abstract String getDescricao();
}
