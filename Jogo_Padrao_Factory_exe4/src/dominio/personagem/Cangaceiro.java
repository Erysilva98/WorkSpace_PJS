package dominio.personagem;

import aplicacao.Jogador;

public class Cangaceiro implements InimigoPersonagem{

    @Override
    public void atacar(Jogador jogador) {
       int danoCangaceiro = 20;
       jogador.receberDano(danoCangaceiro);

       System.out.println("Cangaceiro atacou o jogador e causou " + danoCangaceiro + "% de dano!");
    }

}
