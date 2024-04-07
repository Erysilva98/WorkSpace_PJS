package aplicacao;

import java.util.Random;

import dominio.fabrica.InimigoFabrica;
import dominio.fabrica.AmazoniaInimigoFabrica;
import dominio.fabrica.SertaoInimigoFabrica;
import dominio.personagem.InimigoPersonagem;


public class Jogo {
    private Jogador jogador = new Jogador();
    private Random random = new Random();

    public void iniciarJogo() {
        
        while (jogador.getHPJogador() > 0) {
            
            String[] regioesPersonagemInimigo = {"Amazonia", "Sertao"};
            int moveJogador = random.nextInt(regioesPersonagemInimigo.length);
            String localizacaoJogadorAtual = regioesPersonagemInimigo[moveJogador];

            System.out.println("\n Jogador se move para região: " + localizacaoJogadorAtual);
            InimigoFabrica fabrica = getFabricarInimigo(localizacaoJogadorAtual);
            InimigoPersonagem inimigo = fabrica.criarInimigo();
            inimigo.atacar(jogador);

            if (jogador.getHPJogador() <= 10) {
                System.out.println("\n Jogador está quase morto. HP: " + jogador.getHPJogador());
                break;
            }
            else if (jogador.getHPJogador() <= 0) {
                System.out.println("\n Jogador morreu após ataque do inimigo");
                break;
            }
            else {
                System.out.println("\n Jogador sobreviveu ao ataque do inimigo em " + localizacaoJogadorAtual);
            }
        }
    }

    private InimigoFabrica getFabricarInimigo(String localizacaoJogadorAtual) {
        if (localizacaoJogadorAtual.equals("Amazonia")) {
            return new AmazoniaInimigoFabrica();
        }
        else if (localizacaoJogadorAtual.equals("Sertao")) {
            return new SertaoInimigoFabrica();
        }
        return null;
    }
}
