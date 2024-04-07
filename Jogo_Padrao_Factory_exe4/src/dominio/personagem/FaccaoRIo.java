package dominio.personagem;

import aplicacao.Jogador;

public class FaccaoRIo implements InimigoPersonagem{

    @Override
    public void atacar(Jogador jogador) {
        int danoFaccaoRio = 10;
        jogador.receberDano(danoFaccaoRio);

        System.out.println("Facção do Rio atacou o jogador e causou " + danoFaccaoRio + "% de dano!");
    }
}
