package pesquisaWeb.filtro;

public class MaiorQue60Filtro implements ConsultaFiltro {

    @Override
    public boolean filtrar(String consulta) {
        return consulta.length() > 60;
    }
}
