# Tipos Primitivos e Variáveis

## Objetivo

Praticar a declaração e a inicialização de variáveis, o uso de diferentes tipos
de dados, a leitura de informações pelo teclado e a exibição de resultados.

## Conceitos

- Uma variável guarda um valor e possui um tipo declarado.
- Os tipos primitivos usados nos exercícios incluem `int`, `double`,
  `boolean` e `char`.
- `String` é uma classe usada para representar textos, não um tipo primitivo.
- A classe `Scanner`, importada de `java.util`, permite ler dados da entrada
  padrão.
- Métodos como `nextInt()`, `nextDouble()`, `nextBoolean()` e `next()` leem
  diferentes tipos de entrada.
- `nextBoolean()` espera `true` ou `false`.
- `next().charAt(0)` lê uma palavra e obtém seu primeiro caractere.
- `System.out.printf` permite formatar valores, como limitar a quantidade de
  casas decimais.

## O que entendi

- Ao usar `nextBoolean()`, é necessário informar `true` ou `false`.
- Para obter um `char` a partir de uma palavra lida com `Scanner`, pode-se usar
  `next().charAt(0)`.
- Testar entradas diferentes ajuda a conferir os cálculos e o comportamento
  do programa.

## Dúvidas

- Quais são as diferenças entre os métodos de leitura do `Scanner`
  (`next()`, `nextLine()`, `nextInt()`, etc.)?
- Regras de conversão entre tipos numéricos, como `int` e `double`.
- Precisão de valores decimais em cálculos e como o Java lida com arredondamentos.

## Referências utilizadas

- Curso em Vídeo — Java Básico, Aula 6: Tipos Primitivos e Manipulação de Dados.
- Codédex — conteúdo e exercícios sobre variáveis.