package dominio.personagem;

import aplicacao.Jogador;

public class AnimalMutante implements InimigoPersonagem {

    @Override
    public void atacar(Jogador jogador) {
        int danoAnimalMutante = 15;
        
        jogador.receberDano(danoAnimalMutante); 
        System.out.println("Animal Mutante atacou o jogador e causou " + danoAnimalMutante + "% de dano!");
    }
}
