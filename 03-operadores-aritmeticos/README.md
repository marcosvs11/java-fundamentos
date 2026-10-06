# Operadores Aritméticos

## Objetivo

Praticar operações aritméticas em Java e usar métodos da classe `Math` em cálculos com números.

## Conceitos

- Operadores aritméticos usados nos exercícios: `+`, `-` e `*`.
- `double` permite trabalhar com valores decimais.
- A classe `Math` oferece constantes e métodos matemáticos, como:
    - `Math.PI`: constante π;
    - `Math.pow()`: potenciação;
    - `Math.sqrt()` e `Math.cbrt()`: raiz quadrada e raiz cúbica;
    - `Math.abs()`: valor absoluto;
    - `Math.floor()`, `Math.ceil()` e `Math.round()`: formas diferentes de arredondamento;
    - `Math.random()`: número aleatório entre `0.0` (inclusivo) e `1.0` (exclusivo).
- Para ajustar o intervalo de `Math.random()`, usei a ideia:
  `início + aleatório * (fim - início)`.
  O limite superior não é incluído.
- Uma variável local deve ser declarada uma vez no método. Para mudar seu valor, faço uma atribuição sem repetir o tipo, por exemplo: `resultado = num1 - num2;`.

## O que entendi

- `print` e `printf` mostram resultados sem necessariamente começar uma nova linha; `println` termina a impressão com uma quebra de linha.
- Posso guardar o resultado de uma operação em uma variável e reutilizá-la em outra operação.
- `floor` arredonda para baixo, `ceil` para cima e `round` para o inteiro mais próximo.
- Para calcular a área do círculo, usei π multiplicado pelo raio ao quadrado; para a circunferência, usei `2 * π * raio`.
- O erro da calculadora ocorreu porque tentei declarar `resultado` mais de uma vez no mesmo método. Depois da primeira declaração, devo apenas atribuir novos valores à variável.

## Dúvidas

- No exercício da semiesfera, devo calcular somente a área curva ou a área total, incluindo a base circular?
- Como adaptar `Math.random()` quando preciso incluir também o limite superior do intervalo?

## Referências utilizadas

Curso em Vídeo — Curso de Java Básico, Aula 07: Operadores Aritméticos e Classe `Math`.
- Exercícios próprios registrados nesta pasta.