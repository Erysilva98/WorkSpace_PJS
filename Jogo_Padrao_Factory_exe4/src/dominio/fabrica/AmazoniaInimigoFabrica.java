package dominio.fabrica;

import dominio.personagem.AnimalMutante;
import dominio.personagem.InimigoPersonagem;

public class AmazoniaInimigoFabrica extends InimigoFabrica{

    @Override
    public InimigoPersonagem criarInimigo() {
        return new AnimalMutante();
    }

}
