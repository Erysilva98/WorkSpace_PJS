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

- **EnemyFactory:** Uma interface para a fábrica de inimigos.
- **AmazonEnemyFactory, SertaoEnemyFactory:** Classes concretas que implementam a interface EnemyFactory para criar inimigos específicos para a Amazônia e o Sertão, respectivamente.
- **Enemy:** Uma interface para os inimigos.
- **MutantAnimal, Cangaceiro:** Classes concretas que implementam a interface Enemy para representar os diferentes tipos de inimigos.

### Exemplo de Uso

No código principal do jogo, o padrão Factory Method é utilizado para criar os inimigos apropriados com base na localização atual do jogador. Isso permite que o jogo adicione facilmente novas localizações e tipos de inimigos no futuro.

## Artefatos do Projeto

- **Diagrama de Classes:** Um diagrama de classes que ilustra a estrutura do projeto e o uso do padrão Factory Method.
- **Código:** O código fonte do projeto, implementando o padrão Factory Method para a criação de inimigos.
- **Simulação:** Uma simulação simples que demonstra o funcionamento do jogo com a criação dinâmica de inimigos com base na localização do jogador.

## Projeto
Este projeto é uma resolução da Atividade de Padrões de Projetos do Curso de Engenharia de Software