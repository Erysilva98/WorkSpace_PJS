package pesquisaWeb.model;

import pesquisaWeb.observador.ConsultaObservador;

import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class PesquisaWebModelo {

    private final File arquivoFonte;
    private final List<ConsultaObservador> observadores = new ArrayList<>();

    public PesquisaWebModelo(File arquivoFonte){
        this.arquivoFonte = arquivoFonte;
    }

    public void adicionarObservadorConsulta(ConsultaObservador consultaObservador) {
        observadores.add(consultaObservador);
    }

    public void simularPesquisa() {
        try (BufferedReader lerArquivo = new BufferedReader(new FileReader(arquivoFonte))) {
            String linha;

            while ((linha = lerArquivo.readLine()) != null) {
                notificarObservadores(linha);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void notificarObservadores(String linha) {
        for (ConsultaObservador observador : observadores) {
            observador.aoReceberConsulta(linha);
        }
    }
}
