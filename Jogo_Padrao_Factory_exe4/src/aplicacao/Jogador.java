package aplicacao;

public class Jogador {
    private int hpJogador = 100;

    public void receberDano(int danoInimigo) {
        this.hpJogador -= danoInimigo;
    }

    public int getHPJogador() {
        return hpJogador;
    }
}
