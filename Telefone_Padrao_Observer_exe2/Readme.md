# Padrões de Projetos Orientados a Objetos - Prática Padrão Observer

## Telefone

Este projeto é uma implementação do padrão de projeto Observer aplicado a um simulador de telefone. O pacote `telephone` contém código parcial para simular algumas partes de um telefone. O objetivo é notificar os observadores sempre que um novo dígito for inserido para o número de telefone.

### Implementação do Padrão Observer

O código utiliza o padrão Observer da seguinte forma:

- **Interface de Observador:** Define-se uma interface para os observadores, que serão notificados sempre que um novo dígito for inserido.

- **Notificação de Observadores:** Os observadores são notificados a cada dígito inserido, permitindo que realizem ações específicas.

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