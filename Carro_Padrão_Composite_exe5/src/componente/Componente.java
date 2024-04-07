package componente;

public interface Componente {
    double getPeso();
    void adicionar(Componente componente);
    void remover(Componente componente);
    String getNome();
}
