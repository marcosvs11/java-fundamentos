# Operadores Lógicos e Relacionais

## Objetivo

Usar comparações e combinar condições para representar regras em um programa. Também praticar a escolha de um resultado com o operador ternário.

## Conceitos

- Operadores relacionais comparam valores e produzem `true` ou `false`:
    - `>` maior que;
    - `<` menor que;
    - `>=` maior ou igual a;
    - `<=` menor ou igual a;
    - `==` igual a;
    - `!=` diferente de.
- Operadores lógicos combinam ou invertem valores booleanos:
    - `&&`: verdadeiro quando os dois lados são verdadeiros;
    - `||`: verdadeiro quando pelo menos um lado é verdadeiro, inclusive quando os dois são;
    - `^`: verdadeiro quando exatamente um dos lados é verdadeiro;
    - `!`: inverte o valor lógico.
- O operador ternário `condição ? resultadoSeVerdadeiro : resultadoSeFalso` escolhe entre dois resultados.
- Para comparar o conteúdo de `String`, use `.equals()`. Essa comparação diferencia letras maiúsculas de minúsculas.

## O que entendi

- Uma comparação, como `idade >= 18`, produz um valor booleano.
- Os operadores lógicos permitem combinar condições para representar regras.
- `^` exige que exatamente uma condição seja verdadeira; `||` aceita uma ou as duas.
- Uma regra como “matriculado e com horário agendado ou funcionário” pode ser escrita como `matricula && (agendamento || funcionaria)`.
- Posso usar o operador ternário para escolher entre dois resultados com base em uma condição.
- Para comparar o texto digitado com outro texto, devo usar `.equals()`, e não `==`.

## Dúvidas

- Ainda preciso praticar a tradução de regras escritas para expressões lógicas, principalmente quando o enunciado diz “ou”.
- Preciso observar se o “ou” do enunciado permite as duas condições ao mesmo tempo ou exige apenas uma delas.
- Quero praticar a precedência dos operadores e decidir quando usar parênteses para deixar a expressão mais clara.

## Referências utilizadas

- Curso em Vídeo — Java Básico, Aula 08.
- Exercícios próprios de operadores relacionais e lógicos.
- [Java Language Specification — tipos e valores booleanos](https://docs.oracle.com/javase/specs/jls/se26/html/jls-4.html) — consulta complementar feita com auxílio de IA.