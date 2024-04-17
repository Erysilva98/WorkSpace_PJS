package pesquisaWeb.observador;

import pesquisaWeb.filtro.ConsultaFiltro;
import pesquisaWeb.web.PesquisaWeb;

public class BisbilhoteiroObservador {

    public BisbilhoteiroObservador(PesquisaWeb modeloPesquisa, ConsultaFiltro filtroConsulta, String mensagem) {
        modeloPesquisa.adicionarObservadorConsulta(consulta -> {
            if (filtroConsulta.filtrar(consulta)) {
                System.out.println(mensagem + consulta);
            }
        });
    }
}
