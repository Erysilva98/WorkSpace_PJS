package dominio.fabrica;

import dominio.personagem.Cangaceiro;
import dominio.personagem.InimigoPersonagem;

public class SertaoInimigoFabrica extends InimigoFabrica{

    @Override
    public InimigoPersonagem criarInimigo() {
        return new Cangaceiro();
    }

}
