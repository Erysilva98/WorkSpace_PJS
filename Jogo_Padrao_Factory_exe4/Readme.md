# Padrões de Projetos Orientados a Objetos - Prática Padrão Factory Method

## Jogo de Ação com Localizações Brasileiras

Este projeto é uma implementação do padrão de projeto Factory Method aplicado a um jogo de ação que se passa em localizações brasileiras. O jogo possui diferentes localizações, cada uma com seus próprios inimigos.

### Implementação do Padrão Factory Method

O padrão Factory Method é utilizado para criar objetos representando diferentes tipos de inimigos com base na localização atual do jogador no jogo. As localizações suportadas incluem:

- **Amazônia:** Os inimigos são animais mutantes.
- **Sertão:** Os inimigos são cangaceiros.
- **Rio de Janeiro (futuramente):** Os inimigos serão criminosos.

Independentemente da localização, os inimigos sempre atacarão o jogador que estiver passando por aquela região.

### Arquitetura do Projeto - Domain-Driven-Design (DDD)

- **Domínio:** Essa camada, defini as entidades-chave do nosso jogo, como 'Inimigo' e 'Localização', juntamente com as regras de negócio. 

- **Aplicação:** Essa camada, é responsável pela lógica de alto nível do jogo, essa camada utliza as fábricas de domínio para criar os inimigos baseados na localização atual do jogador.

- **Infraestrutura:** A camada de aplicação e domínio, lidar com as questões técnicas como inicialização do jogo e interações externas. Tendo como ponto de entrada do Jogo ('Main.java')

### Estrutura do Projeto

- `Main.java`: Classe principal que inicia o jogo.

#### Pacote `aplicacao`

- `Jogo.java`: 

- **Tipo**: Classe
- **Descrição**: Contém a lógica principal do jogo, incluindo a inicialização e o loop do jogo.
- **Métodos**:
    - `void iniciarJogo()`: Inicia o loop do jogo, movendo o jogador entre regiões e enfrentando inimigos até que o jogador perca todos os pontos de vida.

- `Jogador.java`: 

- **Tipo**: Classe
- **Descrição**: Representa o jogador dentro do jogo, contendo informações essenciais como pontos de vida (HP).
- **Métodos**:
  - `void receberDano(int danoInimigo)`: Reduz os pontos de vida do jogador com base no dano recebido de um inimigo.
  - `int getHPJogador()`: Retorna os pontos de vida atuais do jogador.

#### Pacote `dominio.fabrica`

- `InimigoFabrica.java`

- **Tipo**: Classe Abstrata
- **Descrição**: Classe abstrata que define o método de fábrica para criar diferentes inimigos baseados na localização do jogador.
- **Métodos**:
  - `InimigoPersonagem criarInimigo()`: Método abstrato para criar um inimigo específico.

- `AmazoniaInimigoFabrica.java`

- **Tipo**: Classe
- **Descrição**: Fábrica concreta para criar inimigos específicos da região da Amazônia.
- **Métodos**:
  - `InimigoPersonagem criarInimigo()`: Cria e retorna um `AnimalMutante` como inimigo da Amazônia.

- `SertaoInimigoFabrica.java`

- **Tipo**: Classe
- **Descrição**: Fábrica concreta para criar inimigos específicos da região do Sertão.
- **Métodos**:
  - `InimigoPersonagem criarInimigo()`: Cria e retorna um `Cangaceiro` como inimigo do Sertão.

- `FaccaoRioInimigoFabrica.java`

- **Tipo**: Classe
- **Descrição**: Fábrica concreta para criar inimigos específicos da região do Rio de Janeiro.
- **Métodos**:
  - `InimigoPersonagem criarInimigo()`: Cria e retorna uma `FaccaoRio` como inimigo do Rio de Janeiro.

#### Pacote `dominio.personagem`

- `InimigoPersonagem.java`

- **Tipo**: Interface
- **Descrição**: Define a interface comum para todos os inimigos do jogo, garantindo que todos possam atacar o jogador.
- **Métodos**:
  - `void atacar(Jogador jogador)`: Define o método de ataque ao jogador.

- `AnimalMutante.java`, `Cangaceiro.java` e `FaccaoRio.java`

- **Tipo**: Classe
- **Descrição**: Implementações concretas da interface `InimigoPersonagem`, representando inimigos específicos de cada região.
- **Métodos**:
  - `void atacar(Jogador jogador)`: Implementa o ataque ao jogador, causando uma quantidade específica de dano baseada no tipo de inimigo.

### Exemplo de Uso

No código principal do jogo, o padrão Factory Method é utilizado para criar os inimigos apropriados com base na localização atual do jogador. Isso permite que o jogo adicione facilmente novas localizações e tipos de inimigos no futuro.

## Artefatos do Projeto

- **Diagrama de Classes:** Um diagrama de classes que ilustra a estrutura do projeto e o uso do padrão Factory Method.
- **Código:** O código fonte do projeto, implementando o padrão Factory Method para a criação de inimigos.
- **Simulação:** Uma simulação simples que demonstra o funcionamento do jogo com a criação dinâmica de inimigos com base na localização do jogador.

## Projeto
Este projeto é uma resolução da Atividade de Padrões de Projetos do Curso de Engenharia de Software