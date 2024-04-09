import pesquisaWeb.filtro.ContemAmigoFiltro;
import pesquisaWeb.filtro.MaiorQue60Filtro;
import pesquisaWeb.model.PesquisaWebModelo;
import pesquisaWeb.observador.BisbilhoteiroObservador;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File arquivoEntrada = new File("./data/Hamlet.txt");
        PesquisaWebModelo modeloPesquisa = new PesquisaWebModelo(arquivoEntrada);

        new BisbilhoteiroObservador(modeloPesquisa, new ContemAmigoFiltro(), "Oh Yes! ");

        new BisbilhoteiroObservador(modeloPesquisa, new MaiorQue60Filtro(), "So long... ");

        modeloPesquisa.simularPesquisa();
    }
}
