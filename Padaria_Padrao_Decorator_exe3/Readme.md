# Padrões de Projetos Orientados a Objetos - Prática Padrão Decorator

## Padaria

Este projeto é uma implementação do padrão de projeto Decorator aplicado a uma padaria simulada. Uma padaria que faz dois tipos de bolos: baunilha e chocolate. O objetivo é permitir que a padaria crie bolos mais complexos, como um "bolo de baunilha em várias camadas com granulado que diz 'Olá, mundo!'" usando o padrão Decorator.

### Implementação do Padrão Decorator

O código utiliza o padrão Decorator da seguinte forma:

- **Classes de Decorador:** São criadas classes de decorador necessárias para adicionar funcionalidades aos bolos:
  - Para bolos de várias camadas, adiciona-se $5 ao custo e imprime-se "Multi-layered" na frente do nome.
  - Para granulado, adiciona-se $2 ao custo e imprime-se "with sprinkles" no final do nome.
  - Para um bolo com o dizer X, não adiciona-se nada ao custo e imprime-se "with saying 'X''" no final do nome.

- **Novo Tipo de Bolo:** Acrescenta-se um novo tipo de bolo: bolo de morango, que custa o dobro de um bolo padrão.

# Estrutura do Projeto

- `Main.java`: Classe principal que inicia o pedido de bolos.

- **Tipo**: Classe
- **Descrição**: Orquestra a criação de bolos com diversos decoradores e imprime os detalhes do pedido.
- **Métodos**:
  - `main(String[] args)`: Método de entrada do programa.

- Pacote `padaria.bolos`

- `Bolo.java`

- **Tipo**: Classe Abstrata
- **Descrição**: Define a estrutura base de um bolo, incluindo seu custo e descrição.
- **Métodos**:
  - `getCustoBolo()`: Retorna o custo base do bolo.
  - `getDescricao()`: Método abstrato para obter a descrição do bolo.

- `BoloBaunilha.java`

- **Tipo**: Classe
- **Descrição**: Representa um bolo de baunilha.
- **Métodos**:
  - `getDescricao()`: Retorna a descrição do bolo de baunilha.

- `BoloChocolate.java`

- **Tipo**: Classe
- **Descrição**: Representa um bolo de chocolate.
- **Métodos**:
  - `getDescricao()`: Retorna a descrição do bolo de chocolate.

- `BoloMorango.java`

- **Tipo**: Classe
- **Descrição**: Representa um bolo de morango, com custo diferenciado.
- **Métodos**:
  - `getCustoBolo()`: Retorna o custo do bolo de morango, que é o dobro do preço base.
  - `getDescricao()`: Retorna a descrição do bolo de morango.

- `Pedido.java`

- **Tipo**: Classe
- **Descrição**: Gerencia um pedido contendo uma lista de bolos.
- **Métodos**:
  - `adicionarBolo(Bolo bolo)`: Adiciona um bolo ao pedido.
  - `imprimirPedido()`: Imprime os detalhes de todos os bolos no pedido.

- Pacote `padaria.decoradores`

- `DecoradorBolo.java`

- **Tipo**: Classe Abstrata
- **Descrição**: Base para decoradores de bolo, extendendo a classe Bolo para adicionar funcionalidades.
- **Métodos**:
  - `getDescricao()`: Retorna a descrição do bolo decorado.
  - `getCustoBolo()`: Retorna o custo do bolo decorado.

- `DecoradorBoloFrase.java`

- **Tipo**: Classe
- **Descrição**: Adiciona uma frase à descrição do bolo.
- **Métodos**:
  - `getDescricao()`: Retorna a descrição do bolo com uma frase adicionada.

- `DecoradorGranulado.java`

- **Tipo**: Classe
- **Descrição**: Adiciona granulado ao bolo, aumentando seu custo.
- **Métodos**:
  - `getCustoBolo()`: Retorna o custo do bolo com granulado adicionado.
  - `getDescricao()`: Retorna a descrição do bolo com granulado.

- `DecoradorMultiCamadas.java`

- **Tipo**: Classe
- **Descrição**: Adiciona múltiplas camadas ao bolo, aumentando seu custo.
- **Métodos**:
  - `getCustoBolo()`: Retorna o custo do bolo com múltiplas camadas adicionadas.
  - `getDescricao()`: Retorna a descrição do bolo multi-camadas.


### Exemplo de Uso

No código `Main.java`, adiciona-se o seguinte a um pedido e imprime-se o pedido:
- Bolo de chocolate
- Bolo de baunilha com o dizer "PLAIN!"
- Bolo de baunilha com granulado com os dizeres "FANCY"
- Bolo de morango em várias camadas com granulado duplo e dois dizeres "One of" e "EVERYTHING"

### Observações

- Adicionar um novo tipo de bolo não altera nenhum código existente (exceto para instanciá-lo).
- Adicionar uma nova maneira de decorar/estilizar o bolo (como multicamadas ou com granulado) não altera nenhum código existente (exceto para instanciá-lo).

## Exemplo de Saída do Programa

```
10 Chocolate cake
10 Vanilla cake with saying "PLAIN!"
12 Vanilla cake with sprinkles with saying "FANCY!"
29 Multi-layered Strawberry cake with sprinkles with sprinkles with saying "One of" with saying "EVERYTHING"
```
## Projeto
Este projeto é uma resolução da Atividade de Padrões de Projetos do Curso de Engenharia de Software