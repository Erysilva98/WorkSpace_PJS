import componente.*;

public class Main {
    public static void main(String[] args) {
        ComponenteParteCarro carro = new ComponenteParteCarro("Carro", 0);
        ComponenteParteCarro carroceria = new ComponenteParteCarro("Carroceria", 1000);
        ComponenteParteCarro chassi = new ComponenteParteCarro("Chassi", 800);
        ComponenteParteCarro tremDeForca = new ComponenteParteCarro("Trem de Força", 600);

        // Adicionando componentes da carroceria
        carroceria.adicionar(new ParteCarro("Porta", 200)); 
        carroceria.adicionar(new ParteCarro("Capô", 100));
        carroceria.adicionar(new ParteCarro("Porta Malas", 100));
        carroceria.adicionar(new ParteCarro("Para Lamas", 200));
        carroceria.adicionar(new ParteCarro("Painel", 100));

        // Composição do chassi com Trem de Força e suspensão
        chassi.adicionar(new ParteCarro("Suspensão", 200));

        // Adicionando componentes do trem de força
        tremDeForca.adicionar(new ParteCarro("Motor", 300));
        tremDeForca.adicionar(new ParteCarro("Transmissão", 200));
        tremDeForca.adicionar(new ParteCarro("Eixo", 100));
        tremDeForca.adicionar(new ParteCarro("Rodas", 100));

        // Montando o carro
        carro.adicionar(chassi);
        chassi.adicionar(tremDeForca);
        carro.adicionar(carroceria);
        
        // Exibindo o peso total do carro
        System.out.println("\n Peso total do carro: " + carro.getPeso() + "kg");
    }
}
