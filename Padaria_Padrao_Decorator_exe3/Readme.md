# Padrões de Projetos Orientados a Objetos - Prática Padrão Decorator

## Padaria

Este projeto é uma implementação do padrão de projeto Decorator aplicado a uma padaria simulada. O pacote `bakery` contém código parcial para uma padaria que faz dois tipos de bolos: baunilha e chocolate. O objetivo é permitir que a padaria crie bolos mais complexos, como um "bolo de baunilha em várias camadas com granulado que diz 'Olá, mundo!'" usando o padrão Decorator.

### Implementação do Padrão Decorator

O código utiliza o padrão Decorator da seguinte forma:

- **Classes de Decorador:** São criadas classes de decorador necessárias para adicionar funcionalidades aos bolos:
  - Para bolos de várias camadas, adiciona-se $5 ao custo e imprime-se "Multi-layered" na frente do nome.
  - Para granulado, adiciona-se $2 ao custo e imprime-se "with sprinkles" no final do nome.
  - Para um bolo com o dizer X, não adiciona-se nada ao custo e imprime-se "with saying 'X''" no final do nome.

- **Novo Tipo de Bolo:** Acrescenta-se um novo tipo de bolo: bolo de morango, que custa o dobro de um bolo padrão.

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