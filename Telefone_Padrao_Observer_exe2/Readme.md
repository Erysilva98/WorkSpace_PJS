# Padrões de Projetos Orientados a Objetos - Prática Padrão Observer

## Telefone

Este projeto é uma implementação do padrão de projeto Observer aplicado a um simulador de telefone. O pacote `telephone` contém código parcial para simular algumas partes de um telefone. O objetivo é notificar os observadores sempre que um novo dígito for inserido para o número de telefone.

### Implementação do Padrão Observer

O código utiliza o padrão Observer da seguinte forma:

- **Interface de Observador:** Define-se uma interface para os observadores, que serão notificados sempre que um novo dígito for inserido.

- **Notificação de Observadores:** Os observadores são notificados a cada dígito inserido, permitindo que realizem ações específicas.

# Estrutura do Projeto Telefone

Este documento descreve a estrutura e os componentes do projeto de simulação de telefone.

- `Main.java`
  - **Tipo**: Classe
  - **Descrição**: Inicia a simulação de um teclado de telefone e a interação com o modelo de telefone.
  - **Métodos**:
    - `main(String[] args)`: Método de entrada do programa que configura a simulação.

- Pacote `telefone.model`

- `TelefoneModel.java`
  - **Tipo**: Classe
  - **Descrição**: Mantém o estado do telefone e notifica os observadores sobre a digitação de números.
  - **Métodos**:
    - `digitarNumero(int novoNumero)`: Registra um número discado.
    - `adicionarObservador(Observador observador)`: Adiciona um observador ao telefone.
    - `getNumerosDiscados()`: Retorna a lista de números discados.

- Pacote `telefone.observador`

- `Observador.java`
  - **Tipo**: Interface
  - **Descrição**: Define um observador que reage a mudanças no estado do telefone.
  - **Métodos**:
    - `atualizar(int numeroDiscado)`: Invocado quando um número é discado.

- `DiscagemObservador.java`
  - **Tipo**: Classe
  - **Descrição**: Observador que exibe o número completo quando a sequência de discagem é finalizada.
  - **Métodos**:
    - `atualizar(int numeroDiscado)`: Implementação específica para discagem completa.

- `NumeroRecenteObservador.java`
  - **Tipo**: Classe
  - **Descrição**: Observador que exibe o número mais recentemente discado.
  - **Métodos**:
    - `atualizar(int numeroDiscado)`: Implementação específica para exibição do número recente.

- Pacote `telefone.teclado`

- `Teclado.java`
  - **Tipo**: Classe
  - **Descrição**: Simula um teclado de telefone que dispara a digitação de números.
  - **Métodos**:
    - `simularPressionarTecla(int numeroPressionado)`: Simula o ato de pressionar uma tecla várias vezes.

- Pacote `telefone.view`

- `TelaView.java`
  - **Tipo**: Classe
  - **Descrição**: Representa a tela onde os números discados são exibidos.
  - **Métodos**:
    - `exibirNumeroDiscado(String numeroDiscado)`: Exibe o número discado na tela.

### Exemplo de Uso

A UI (classe `Screen`) cria dois observadores:

1. O primeiro observador imprime o dígito mais recente na tela.
2. O segundo observador imprime "Agora discando 081999887766..." na tela, onde o número é o número que o modelo possui.

### Restrições

- Somente a UI pode imprimir na tela.
- O telefone deve ser desacoplado da UI, ou seja, não deve saber sobre a UI.

## Exemplo de Saída do Programa

```
Pressionando: 0
0
Pressionando: 8
8
Pressionando: 1
1
Pressionando: 9
9
Pressionando: 9
9
Pressionando: 9
9
Pressionando: 8
8
Pressionando: 8
8
Pressionando: 7
7
Pressionando: 7
7
Pressionando: 6
6
Pressionando: 6
6
Agora discando 081999887766...
```
## Projeto
Este projeto é uma resolução da Atividade de Padrões de Projetos do Curso de Engenharia de Software