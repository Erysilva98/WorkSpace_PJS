package aplicacao;

public class Jogador {
    private int hpJogador = 100;

    public void receberDano(int danoInimigo) {
        this.hpJogador -= danoInimigo;

        if (this.hpJogador <= 10) {
            System.out.println("Jogador recebeu " + danoInimigo + "% de dano. HP: " + this.hpJogador + "% - Jogador está quase morto");
        }
        
        else if (this.hpJogador <= 0) {
            System.out.println("Jogador recebeu " + danoInimigo + "% de dano. HP: " + this.hpJogador + "% - Jogador morreu");  
        }
        else {
            System.out.println("Jogador recebeu " + danoInimigo + "% de dano. HP: " + this.hpJogador);
        }
    }

    public int getHPJogador() {
        return hpJogador;
    }
}
