package pesquisaWeb.filtro;

public class ContemAmigoFiltro implements ConsultaFiltro{

    @Override
    public boolean filtrar(String consulta) {
        return consulta.toLowerCase().contains("friend");
    }
}
