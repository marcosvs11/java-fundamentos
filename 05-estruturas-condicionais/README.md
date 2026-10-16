# Estruturas Condicionais

## Objetivo

Praticar como um programa escolhe diferentes caminhos a partir de condições e como combinar essas decisões para representar regras.

## Conceitos

- `if` executa um bloco quando sua condição é verdadeira.
- `else` define o caminho alternativo quando a condição do `if` é falsa.
- `else if` permite testar condições alternativas em sequência. A primeira condição verdadeira determina o bloco executado.
- Condições compostas usam operadores relacionais e lógicos, como `>=`, `&&` e `||`.
- Condicionais aninhadas permitem fazer uma verificação dentro de outra, mas a indentação ajuda a enxergar a qual `if` cada `else` pertence.
- `switch` seleciona um caminho conforme o valor de uma expressão. `case` representa uma opção, `break` encerra aquele caso e `default` atende a valores não listados.
- O operador resto (`%`) pode ajudar a verificar divisibilidade, como identificar se um número é par.

## O que entendi

- Uma condição é avaliada como verdadeira ou falsa, e esse resultado controla qual bloco será executado.
- A ordem dos testes em um encadeamento importa: quando um `if` ou `else if` encontra uma condição verdadeira, os testes seguintes daquele encadeamento não são executados.
- Para representar regras com mais de um requisito, preciso decidir se todos devem ser verdadeiros (`&&`) ou se basta um deles (`||`).
- Posso usar condicionais aninhadas para validar uma entrada antes de continuar com cálculos que dependem dela.
- `switch` é uma alternativa para selecionar entre opções específicas, como as operações de uma calculadora.

## Exercícios

- `NumeroPositivo.java`: condição simples.
- `MaioridadePenal.java` e `ParOuImpar.java`: decisões com alternativas e comparação.
- `FreteGratis.java` e `AprovarAluno.java`: combinação de regras.
- `AprovaAlunoV2.java`, `DescontoCompra.java` e `VerificadorTriangulos.java`: condicionais encadeadas ou aninhadas, validações e regras com vários resultados.
- `CalculadoraSwitch.java`: seleção de operação com `switch`.

## Dúvidas e pontos para continuar praticando

- Verificar os limites das regras com valores exatamente iguais ao mínimo ou máximo.
- Decidir quando uma condição aninhada deixa o fluxo mais claro e quando um encadeamento seria suficiente.
- Tratar entradas inválidas sem deixar o programa seguir com dados inadequados.

## Referências utilizadas

- Curso em Vídeo — Java Básico, aulas 09 e 10.
- Codédex — Java, capítulos sobre controle de fluxo e loops.
- Exercícios próprios sobre estruturas condicionais.
