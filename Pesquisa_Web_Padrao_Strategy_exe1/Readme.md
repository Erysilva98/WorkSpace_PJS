# Padrões de Projetos Orientados a Objetos - Prática Padrão Strategy

## Pesquisa na Web

Este projeto é uma implementação do padrão de projeto Strategy aplicado a um simulador de mecanismo de busca na Web. O pacote `websearch` contém código parcial para simular a leitura de um arquivo de dados e tratar cada linha como uma consulta enviada a um mecanismo de pesquisa. O objetivo é extrair, em tempo real, consultas "interessantes" que atendam a determinadas condições.

### Funcionamento

O código já utiliza objetos "observadores" para notificar o `Snooper` de cada consulta, que por sua vez imprime todas as consultas. A implementação do padrão Strategy requer as seguintes alterações:

- **Interface de Filtro de Consulta:** No modelo de busca, cria-se uma nova interface que define um objeto de filtro de consulta. Esse objeto terá um método que recebe uma string (a consulta) e retorna `true` se o modelo de busca deve notificar o observador sobre essa consulta, ou `false` caso contrário.

- **Registro de Observadores:** Altera-se o modelo de busca para que, ao registrar um observador, o método de registro também aceite um objeto de filtro de consulta.

- **Notificação de Observadores:** Modifica-se o modelo de busca para verificar, para cada consulta, se um observador está interessado na consulta antes de notificá-lo.

# Estrutura do Projeto de Pesquisa Web

Este documento descreve a estrutura e os componentes do projeto de pesquisa na web que filtra e observa o texto de "Hamlet".

- Classe Principal

- `Main.java`
  - **Tipo**: Classe
  - **Descrição**: Configura e inicia a simulação da pesquisa na web utilizando o texto de "Hamlet".
  - **Métodos**:
    - `main(String[] args)`: Método de entrada do programa que configura os observadores e inicia a simulação de pesquisa.

- Pacote `pesquisaWeb.model`

- `PesquisaWebModelo.java`
  - **Tipo**: Classe
  - **Descrição**: Mantém o estado da pesquisa web e notifica os observadores sobre cada linha do texto processada.
  - **Métodos**:
    - `adicionarObservadorConsulta(ConsultaObservador consultaObservador)`: Adiciona um observador à pesquisa.
    - `simularPesquisa()`: Simula uma pesquisa lendo o texto e notificando observadores.

- Pacote `pesquisaWeb.filtro`

- `ConsultaFiltro.java`
  - **Tipo**: Interface
  - **Descrição**: Define um filtro que pode ser aplicado a uma string de consulta.
  - **Métodos**:
    - `filtrar(String consulta)`: Determina se a string de consulta atende a um critério de filtro.

- `ContemAmigoFiltro.java`
  - **Tipo**: Classe
  - **Descrição**: Filtro que verifica se a consulta contém a palavra "friend".
  - **Métodos**:
    - `filtrar(String consulta)`: Retorna `true` se a consulta contém a palavra "friend".

- `MaiorQue60Filtro.java`
  - **Tipo**: Classe
  - **Descrição**: Filtro que verifica se a consulta possui mais de 60 caracteres.
  - **Métodos**:
    - `filtrar(String consulta)`: Retorna `true` se a consulta tem mais de 60 caracteres.

- Pacote `pesquisaWeb.observador`

- `ConsultaObservador.java`
  - **Tipo**: Interface
  - **Descrição**: Define um observador que reage às consultas de pesquisa.
  - **Métodos**:
    - `aoReceberConsulta(String consulta)`: Invocado quando uma nova consulta é recebida.

- `BisbilhoteiroObservador.java`
  - **Tipo**: Classe
  - **Descrição**: Observador que imprime uma mensagem quando uma consulta passa pelo filtro.
  - **Métodos**:
    - `BisbilhoteiroObservador(PesquisaWebModelo, ConsultaFiltro, String)`: Construtor que adiciona o observador ao modelo de pesquisa.

### Exemplo de Uso

No cliente (`Snooper.java`), cria-se dois observadores de consulta:

1. Um observador que imprime "Oh Yes! <consulta>" sempre que a consulta contém a palavra 'friend' (não diferencia maiúsculas de minúsculas).
2. Um observador que imprime "So long.... <consulta>" sempre que a consulta tem mais de 60 caracteres.

### Observações

- O modelo de busca não deve ter conhecimento sobre a implementação dos objetos de política de filtro de consulta, exceto que eles implementam a interface necessária.

## Execução
Para executar o projeto, compile e execute o arquivo principal. O programa lerá o arquivo de dados e exibirá as mensagens dos observadores com base nas consultas filtradas.

## Exemplo de Saída do Programa

(Inclua aqui um exemplo de saída do seu programa, mostrando como as consultas são filtradas e impressas pelos observadores.)

```
Oh Yes! Friends to this ground.
So long.... Enter KING CLAUDIUS, QUEEN GERTRUDE, HAMLET, POLONIUS, LAERTES,
VOLTIMAND, CORNELIUS, Lords, and Attendants
Oh Yes! And let thine eye look like a friend on Denmark.
Oh Yes! Sir, my good friend; I'll change that name with you:
Oh Yes! Those friends thou hast, and their adoption tried,
Oh Yes! For loan oft loses both itself and friend,
Oh Yes! O'ermaster 't as you may. And now, good friends,
Oh Yes! As you are friends, scholars and soldiers,
Oh Yes! A worthy pioner! Once more remove, good friends.
So long.... Or 'If we list to speak,' or 'There be, an if they might,'
Oh Yes! May do, to express his love and friending to you,

Oh Yes! As thus, 'I know his father and his friends,
So long.... That's not my meaning: but breathe his faults so quaintly
So long.... As 'twere a thing a little soil'd i' the working, Mark you,
Oh Yes! 'Good sir,' or so, or 'friend,' or 'gentleman,'
Oh Yes! At 'closes in the consequence,' at 'friend or so,'
So long.... Enter KING CLAUDIUS, QUEEN GERTRUDE, ROSENCRANTZ, GUILDENSTERN, and
Attendants
Oh Yes! Welcome, my good friends!
Oh Yes! Friend, look to 't.
Oh Yes! My excellent good friends! How dost thou,
So long.... Guildenstern? Ah, Rosencrantz! Good lads, how do ye both?
Oh Yes! my good friends, deserved at the hands of fortune,
So long.... substance of the ambitious is merely the shadow of a dream.
Oh Yes! beaten way of friendship, what make you at Elsinore?
Oh Yes! thank you: and sure, dear friends, my thanks are
So long.... Why did you laugh then, when I said 'man delights not me'?
Oh Yes! to see thee well. Welcome, good friends. O, my old
Oh Yes! friend! thy face is valenced since I saw thee last:
Oh Yes! Follow him, friends: we'll hear a play to-morrow.
Oh Yes! Dost thou hear me, old friend; can you play the
Oh Yes! My good friends, I'll leave you till night: you are
So long.... Enter KING CLAUDIUS, QUEEN GERTRUDE, POLONIUS, OPHELIA, ROSENCRANTZ, and
GUILDENSTERN
So long.... The courtier's, soldier's, scholar's, eye, tongue, sword;
So long.... How now, my lord! I will the king hear this piece of work?
So long.... To feed and clothe thee? Why should the poor be flatter'd?
So long.... Danish march. A flourish. Enter KING CLAUDIUS, QUEEN GERTRUDE, POLONIUS,
OPHELIA, ROSENCRANTZ, GUILDENSTERN, and others
So long.... Enter a King and a Queen very lovingly; the Queen embracing him, and he her. She kneels,
and makes show of protestation unto him. He takes her up, and declines his head upon her neck: lays him
down upon a bank of flowers: she, seeing him asleep, leaves him. Anon comes in a fellow, takes off his
crown, kisses it, and pours poison in the King's ears, and exit. The Queen returns; finds the King dead, and
makes passionate action. The Poisoner, with some two or three Mutes, comes in again, seeming to lament
with her. The dead body is carried away. The Poisoner wooes the Queen with gifts: she seems loath and
unwilling awhile, but in the end accepts his love
So long.... ashamed to show, he'll not shame to tell you what it means.
Oh Yes! The poor advanced makes friends of enemies.
Oh Yes! For who not needs shall never lack a friend,
Oh Yes! And who in want a hollow friend doth try,
Oh Yes! you deny your griefs to your friend.
So long.... Do you see yonder cloud that's almost in shape of a camel?
Oh Yes! Leave me, friends.
So long.... Enter KING CLAUDIUS, QUEEN GERTRUDE, ROSENCRANTZ, and GUILDENSTERN
Oh Yes! Friends both, go join you with some further aid:
Oh Yes! Come, Gertrude, we'll call up our wisest friends;
So long.... and wife is one flesh; and so, my mother. Come, for England!
So long.... There's tricks i' the world; and hems, and beats her heart;
Oh Yes! That, swoopstake, you will draw both friend and foe,
Oh Yes! To his good friends thus wide I'll ope my arms;
So long.... love, remember: and there is pansies. that's for thoughts.
Oh Yes! Make choice of whom your wisest friends you will.
Oh Yes! And you must put me in your heart for friend,
So long.... that is not guilty of his own death shortens not his own life.
So long.... such-a-one's horse, when he meant to beg it; might it not?
So long.... but to play at loggats with 'em? mine ache to think on't.
So long.... this box; and must the inheritor himself have no more, ha?
So long.... yours: for my part, I do not lie in't, and yet it is mine.
So long.... 'tis for the dead, not for the quick; therefore thou liest.
So long.... One that was a woman, sir; but, rest her soul, she's dead.
So long.... A whoreson mad fellow's it was: whose do you think it was?
So long.... Enter Priest, & c. in procession; the Corpse of OPHELIA, LAERTES and Mourners following;
KING CLAUDIUS, QUEEN GERTRUDE, their trains, & c
So long.... spirit. Put your bonnet to his right use; 'tis for the head.
So long.... His purse is empty already; all's golden words are spent.
So long.... I knew you must be edified by the margent ere you had done.
So long.... against the Danish. Why is this 'imponed,' as you call it?

So long.... if not, I will gain nothing but my shame and the odd hits.
So long.... To this effect, sir; after what flourish your nature will.
So long.... Enter KING CLAUDIUS, QUEEN GERTRUDE, LAERTES, Lords, OSRIC, and Attendants with
foils, & c
So long.... LAERTES wounds HAMLET; then in scuffling, they change rapiers, and HAMLET wounds
LAERTES
Oh Yes! O, yet defend me, friends; I am but hurt.
So long.... A dead march. Exeunt, bearing off the dead bodies; after which a peal of ordnance is shot off
```

## Projeto
Este projeto é uma resolução da Atividade de Padrões de Projetos do Curso de Engenharia de Software
