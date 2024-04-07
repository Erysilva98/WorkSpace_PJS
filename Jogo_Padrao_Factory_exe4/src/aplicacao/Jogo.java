package aplicacao;

import java.util.Random;

import dominio.fabrica.InimigoFabrica;
import dominio.fabrica.AmazoniaInimigoFabrica;
import dominio.fabrica.SertaoInimigoFabrica;
import dominio.fabrica.FaccaoRioInimigoFabrica;

import dominio.personagem.InimigoPersonagem;

public class Jogo {
    private Jogador jogador = new Jogador();
    private Random random = new Random();

    public void iniciarJogo() {
        
        while (jogador.getHPJogador() >= 0) {
            
            // Regiões que o jogador pode se mover e inimigos na Fabrica - Metodo InimigoFabrica
            String[] regioesPersonagemInimigo = {"Amazonia", "Sertao", "Rio de Janeiro"};

            int moveJogador = random.nextInt(regioesPersonagemInimigo.length);
            String localizacaoJogadorAtual = regioesPersonagemInimigo[moveJogador];

            System.out.println("\n Jogador se mover para região: " + localizacaoJogadorAtual);
            InimigoFabrica fabrica = getFabricarInimigo(localizacaoJogadorAtual);
            InimigoPersonagem inimigo = fabrica.criarInimigo();
            inimigo.atacar(jogador);

            if (jogador.getHPJogador() <= 0 && jogador.getHPJogador() <= 5){
                System.out.println("\nJogador morreu após ataque do inimigo");
                break;
            }
            else if (jogador.getHPJogador() < 10) {
                System.out.println("\nJogador está quase morto. HP: " + jogador.getHPJogador());
            }
            else {
                System.out.println("\nJogador sobreviveu ao ataque com " + jogador.getHPJogador() + "% HP, local "+ localizacaoJogadorAtual);
            }
        }
    }

    // Factory Method para criar inimigos de acordo com a região
    private InimigoFabrica getFabricarInimigo(String localizacaoJogadorAtual) {
        if (localizacaoJogadorAtual.equals("Amazonia")) {
            return new AmazoniaInimigoFabrica();
        }
        else if (localizacaoJogadorAtual.equals("Sertao")) {
            return new SertaoInimigoFabrica();
        }
        else if (localizacaoJogadorAtual.equals("Rio de Janeiro")) {
            return new FaccaoRioInimigoFabrica();
        }
        return null;
    }
}
