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

- **componente** - Contém classes que compõe os componentes do carro 

### Exemplo de Saída do Programa

```
Somando agora o peso de NOME_DA_PARTE: 
PESO_DA_PARTE. 
Total parcial: SOMA_PARCIAL
```

## Artefatos do Projeto

- **Diagrama de Classes:** Um diagrama de classes que ilustra a estrutura do projeto e o uso do padrão Composite.
- **Código:** O código fonte do projeto, implementando o padrão Composite para representar a estrutura do carro e calcular seu peso total.

## Projeto
Este projeto é uma resolução da Atividade de Padrões de Projetos do Curso de Engenharia de Software