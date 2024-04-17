import pesquisaWeb.filtro.ContemAmigoFiltro;
import pesquisaWeb.filtro.MaiorQue60Filtro;
import pesquisaWeb.observador.BisbilhoteiroObservador;
import pesquisaWeb.web.PesquisaWeb;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File arquivoEntrada = new File("./data/Hamlet.txt");
        PesquisaWeb modeloPesquisa = new PesquisaWeb(arquivoEntrada);

        new BisbilhoteiroObservador(modeloPesquisa, new ContemAmigoFiltro(), "Oh Yes! ");

        new BisbilhoteiroObservador(modeloPesquisa, new MaiorQue60Filtro(), "So long... ");

        modeloPesquisa.simularPesquisa();
    }
}
