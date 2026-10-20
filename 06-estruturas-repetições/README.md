# Estruturas de Repetição

## Objetivo

Praticar a repetição de instruções em Java com `while`, `do-while` e `for`, controlando contagens, cálculos e a continuidade de programas no terminal.

## Conceitos

- `while` testa a condição antes de cada execução. Se ela for falsa desde o início, o bloco não será executado.
- `do-while` testa a condição depois do bloco, garantindo pelo menos uma execução.
- `for` reúne a inicialização, a condição de continuidade e a atualização de uma variável de controle.
- `break` encerra o laço mais interno em que está inserido.
- `continue` pula o restante da iteração atual e segue para a próxima. No `while`, a condição é testada novamente.
- Laços aninhados permitem separar a repetição do programa da validação de uma resposta.
- Contadores registram quantidades, como o total de entradas aceitas; acumuladores guardam resultados sucessivos, como somas e produtos.
- `equalsIgnoreCase()` compara textos sem diferenciar maiúsculas de minúsculas. Outra abordagem usada nos exercícios é converter a resposta com `toLowerCase()` antes de comparar com `equals()`.

## O que entendi

- Consigo desenvolver os exercícios desta pasta com autonomia, recorrendo a esclarecimentos pontuais quando necessário e utilizando recursos que compreendo.
- Posso usar `while` para repetir um menu enquanto a resposta permitir e `do-while` para executar uma tarefa antes de perguntar se o usuário deseja continuar.
- Posso usar `for` para gerar uma tabuada, calcular um fatorial e realizar contagens com um passo informado pelo usuário.
- O valor inicial de um acumulador depende da operação: nos exercícios, a soma começa em `0` e o produto do fatorial começa em `1`.
- Posso usar `continue` para rejeitar uma entrada e solicitar novos dados, e `break` para sair de um laço após uma resposta válida.
- Na contagem com passo, preciso impedir o valor zero e verificar se o sinal permite avançar do início em direção ao final.
- Para calcular a média com casas decimais, posso converter a soma para `double` antes de dividir pela quantidade de valores.

## Exercícios

- `EscolhaPokemon.java`: menu de escolha de Pokémon e ataque, com decisões aninhadas e repetição com `while` enquanto a resposta for `s`.
- `Tabuada.java`: multiplicações de 1 a 10 com `for`, repetição do programa com `do-while` e validação da resposta de continuidade.
- `CalculoFatorial.java`: cálculo do fatorial com acumulador de produto e `for`, tratamento de `0!` como `1` e repetição mediante resposta válida.
- `EntradaDeDados.java`: leitura de números não negativos, soma total, soma dos pares e dos ímpares, quantidade de valores maiores que 100 e cálculo da média, com uso de contadores, acumuladores e `continue`.
- `ContadorEspecial.java`: contagem crescente ou decrescente com início, final e passo informados, validação do passo e opção de repetir o programa.

## Dúvidas e pontos para continuar praticando

- As dúvidas durante a elaboração dos exercícios foram pontuais; não há uma dúvida específica registrada para esta etapa.

## Referências utilizadas

- Curso em Vídeo — Java Básico, aulas 12 e 13.
- Codédex — Java.
- [DIO — Estruturas de Controle em Java, trilha Itaú Java com Inteligência Artificial](https://web.dio.me/track/itau-java-com-inteligencia-artificial/course/estruturas-de-controle-em-java/learning/b209a1e1-980b-4307-98be-8bfa7aede465).
