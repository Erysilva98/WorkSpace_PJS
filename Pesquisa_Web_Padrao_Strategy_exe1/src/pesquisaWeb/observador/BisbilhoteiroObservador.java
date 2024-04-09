package pesquisaWeb.observador;

import pesquisaWeb.filtro.ConsultaFiltro;
import pesquisaWeb.model.PesquisaWebModelo;

public class BisbilhoteiroObservador {

    public BisbilhoteiroObservador(PesquisaWebModelo modeloPesquisa, ConsultaFiltro filtroConsulta, String mensagem) {
        modeloPesquisa.adicionarObservadorConsulta(consulta -> {
            if (filtroConsulta.filtrar(consulta)) {
                System.out.println(mensagem + consulta);
            }
        });
    }
}
