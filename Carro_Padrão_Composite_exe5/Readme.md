# Padrões de Projetos Orientados a Objetos - Prática Padrão Composite

## Carro

Este projeto é uma implementação do padrão de projeto Composite aplicado à estrutura de um carro. Um carro é composto por várias partes, cada uma com seu próprio nome e peso.

### Estrutura do Carro

- **Carro:** Composto por uma carroceria e um chassi.
- **Carroceria:** Composta por para-lamas, portas, painéis, porta-malas e capô.
- **Chassi:** Composto por um trem de força e suspensão.
- **Trem de Força:** Composto por motor, transmissão, diferencial e rodas.

### Implementação do Padrão Composite

O padrão Composite é utilizado para representar a estrutura hierárquica do carro. Cada parte do carro é tratada de maneira uniforme, seja uma parte simples como uma roda ou uma parte composta como o chassi.

### Cálculo do Peso Total

O programa calcula o peso total de um carro somando o peso de todas as suas partes. Durante o cálculo, o programa imprime na tela o peso de cada parte sendo somado e o total parcial acumulado.


### Estrutura do Projeto

- `Main.java`: Classe principal que monta e exibe o peso total do carro.

### Pacote `componente`

- `Componente.java`

- **Tipo**: Interface
- **Descrição**: Define a interface comum para todos os componentes do carro, tanto simples quanto compostos.
- **Métodos**:
  - `double getPeso()`: Retorna o peso do componente.
  - `String getNome()`: Retorna o nome do componente.

- `ParteCarro.java`

- **Tipo**: Classe
- **Descrição**: Representa uma parte individual do carro (por exemplo, motor, roda). Implementa a interface `Componente`.
- **Atributos**:
  - `String nome`: O nome da parte do carro.
  - `double peso`: O peso da parte do carro.
- **Métodos Implementados**:
  - `getPeso()`: Retorna o peso da parte do carro.
  - `getNome()`: Retorna o nome da parte do carro.

- `IComponente.java`

- **Tipo**: Interface
- **Descrição**: Estende a interface `Componente` para adicionar métodos de adição e remoção de componentes.
- **Métodos Implementados**:
  - `adicionar(Componente componente)`: Adiciona um componente filho ao composto.
  - `remover(Componente componente)`: Remove um componente filho do composto.

- `ComponenteParteCarro.java`

- **Tipo**: Classe  
- **Descrição**:Representa um componente composto que pode conter outras partes do carro. Implementa a interface `IComponente`.
- **Atributos**:
  - `List<Componente> componentes`: Uma lista dos componentes filhos.
  - `String nome`: O nome do componente composto.
  - `double pesoBase`: O peso base do componente composto, sem contar os pesos de seus componentes filhos.
- **Métodos Implementados**:
  - `getPeso()`: Calcula e retorna o peso total do componente composto.
  - `adicionar(Componente componente)`: Adiciona um componente filho ao composto.
  - `remover(Componente componente)`: Remove um componente filho do composto.
  - `getNome()`: Retorna o nome do componente composto.

### Exemplo de Saída do Programa

- **Saída Esperada:** 
    - Somando agora o peso de NOME_DA_PARTE: 
    PESO_DA_PARTE. 
    Total parcial: SOMA_PARCIAL

- **Saída Atual:**
    - Peso parcial para Trem de Força: 1300.0kg
    - Peso parcial para Chassi: 2300.0kg
    - Peso parcial para Carroceria: 1700.0kg
    - Peso parcial para Carro: 4000.0kg
    - Peso total do carro: 4000.0kg

## Artefatos do Projeto

- **Diagrama de Classes:** Um diagrama de classes que ilustra a estrutura do projeto e o uso do padrão Composite.
- **Código:** O código fonte do projeto, implementando o padrão Composite para representar a estrutura do carro e calcular seu peso total.

## Projeto
Este projeto é uma resolução da Atividade de Padrões de Projetos do Curso de Engenharia de Software







