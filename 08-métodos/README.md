# Métodos

## Objetivo

Praticar a criação e a chamada de métodos com parâmetros e retorno, distinguindo o cálculo de um resultado da sua exibição no terminal.

## Conceitos

- Parâmetros são as variáveis declaradas pelo método para receber os valores da chamada. Argumentos são os valores enviados nessa chamada.
- O tipo de retorno indica o tipo do resultado fornecido pelo método, como `int`, `double` ou `boolean`.
- `return` encerra a execução do método e, nos métodos com retorno de valor, entrega o resultado a quem o chamou.
- `void` indica que o método não retorna um valor. Ele pode executar ações, como imprimir uma mensagem.
- Imprimir com `System.out.println()` e retornar com `return` são operações diferentes.
- O retorno pode ser armazenado em uma variável ou utilizado diretamente em uma expressão, como a condição de um `if`.
- Nos dois programas desta pasta, os métodos foram declarados com `public static` e chamados a partir do `main` da própria classe, sem criar uma instância.

## O que entendi

- Um método que retorna o dobro de um número pode fornecer esse resultado sem mostrar nada na tela.
- Uma chamada como `dobrar(4);` compila mesmo sem guardar o retorno. Se o método apenas calcula e retorna, o valor é descartado e nada é impresso.
- Não posso atribuir a uma variável `int` o resultado de uma chamada a um método `void`, porque essa chamada não fornece um valor.
- O método retorna o resultado; a atribuição no `main` é que o armazena na variável.
- Retornar a média como `double` permite guardá-la no `main` e reutilizá-la, inclusive em decisões, sem limitar o método à impressão.
- Um método de verificação de paridade retorna `boolean` porque responde a uma pergunta com `true` ou `false`.
- Posso guardar o retorno de `ehPar(valor)` em uma variável ou usá-lo diretamente em `if (ehPar(valor))`.
- Nos exercícios implementados, o método realiza o cálculo ou a verificação, enquanto o `main` lê os dados e decide como apresentar a resposta.

## Exercícios

- Prever e explicar, realizado na conversa: comparação entre `dobrar(int)`, com retorno `int`, e `mostrarDobro(int)`, com retorno `void`. Foram analisadas chamadas válidas, o descarte de um retorno e a tentativa inválida de atribuir uma chamada `void` a uma variável inteira. Não há arquivo desse exercício nesta pasta.
- `MostrarMedia.java`: método `calcularMedia(double nota1, double nota2, double nota3)` que retorna a média aritmética. No `main`, as três notas são lidas e armazenadas em um `ArrayList<Double>`, exibidas com `for-each` e enviadas ao método. O retorno é armazenado e impresso com uma casa decimal.
- `CalcularExibir.java`: método `ehPar(int a)` que retorna o resultado de `a % 2 == 0`. O `main` lê um inteiro e usa o retorno booleano para escolher a mensagem de par ou ímpar.

## Dúvidas e pontos para continuar praticando

- A diferença entre retornar e imprimir foi discutida no exercício de previsão e aplicada nos dois programas.
- Nas validações registradas na conversa, `MostrarMedia.java` passou em cinco casos, incluindo notas decimais, zeros e média com arredondamento na exibição. `CalcularExibir.java` passou em sete casos, incluindo zero, negativos e os limites de `int`.
- Sobrecarga de métodos foi mencionada como próximo assunto, mas não foi implementada nos exercícios desta pasta.
- A retenção destes conteúdos após alguns dias sem consultar as soluções ainda não foi verificada nesta sequência.

## Referências utilizadas

- [Curso em Vídeo — Java Básico](https://www.cursoemvideo.com/curso/java-basico/): fonte de estudo informada. A grade oficial identifica o tema como “Aula 15 – Métodos”.
- [Codédex — Java](https://www.codedex.io/java): fonte de estudo informada, sem identificação da lição específica consultada.
- Sequência de três exercícios apresentada nesta conversa, com esclarecimentos e validação com auxílio de IA. As implementações e as explicações do aluno foram avaliadas durante a sequência.
