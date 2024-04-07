package dominio.fabrica;

import dominio.personagem.FaccaoRIo;
import dominio.personagem.InimigoPersonagem;

public class FaccaoRioInimigoFabrica extends InimigoFabrica {
    
    @Override
    public InimigoPersonagem criarInimigo() {
        return new FaccaoRIo();
    }

}
