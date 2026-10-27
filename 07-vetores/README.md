# Vetores e ArrayList

## Objetivo

Praticar o armazenamento e o percurso de valores em arrays, a busca e a ordenação de números e as operações básicas de `ArrayList`, usando programas de terminal.

## Conceitos

- Arrays têm tamanho fixo. Seus índices começam em `0` e vão até `length - 1`.
- `array[indice]` acessa um elemento, enquanto `array.length` informa a quantidade de posições.
- As posições de um array criado com `new int[tamanho]` começam com o valor `0`.
- Um laço `for` permite percorrer os elementos para exibir, somar, contar ou comparar valores.
- A busca sequencial compara o valor procurado com cada elemento e pode identificar todas as ocorrências.
- `Arrays.sort()` ordena os elementos no próprio array. Nos arrays de inteiros destes exercícios, a ordem é crescente.
- `Arrays.binarySearch()` exige o array ordenado. Retorna um índice não negativo quando encontra o valor e um número negativo quando ele está ausente.
- `ArrayList` permite adicionar e remover elementos, alterando a quantidade armazenada.
- Operações utilizadas nas listas: `add()` para adicionar, `get()` para acessar, `set()` para substituir, `remove(indice)` para remover, `size()` para consultar a quantidade e `isEmpty()` para verificar se a lista está vazia.
- `ArrayList<String>` armazena textos e `ArrayList<Integer>` armazena números inteiros.

## O que entendi

- Para mostrar os elementos de um array com um laço, preciso acessar cada posição com o índice. Imprimir diretamente a variável do array não mostra seus elementos como uma lista do Python.
- O índice `1` corresponde ao segundo elemento. Em `BuscarNumero.java`, uso `i + 1` para apresentar posições contadas a partir de `1`, em vez dos índices do Java.
- Posso somar os elementos e contar pares e ímpares durante o percurso. Zero e inteiros negativos também podem ser pares.
- Para encontrar maior e menor, inicializo as duas referências com o primeiro número depois de lê-lo. Inicializar com uma posição ainda não preenchida fez os dois começarem com zero e produziu resultados incorretos nos testes com apenas positivos ou apenas negativos.
- Uma atribuição copia o valor daquele momento: alterar depois o elemento do array não atualiza automaticamente a variável que recebeu seu valor.
- Na busca sequencial, uma comparação sem correspondência significa apenas que o número não está naquela posição. Só posso informar sua ausência do array depois de terminar o percurso sem encontrar nenhuma ocorrência.
- A ordenação muda as posições dos elementos. O índice retornado pela busca binária corresponde ao array já ordenado.
- Posso usar `ArrayList` para adicionar, acessar, substituir e remover cidades e consultar a quantidade final.
- Em `NumerosArrayList.java`, adiciono a entrada e removo o `-1` quando identifico a condição de parada, sem incluí-lo nos cálculos.
- `isEmpty()` retorna `true` para uma lista vazia. A condição `!numeros.isEmpty()` impede o cálculo da média e a exibição de maior e menor quando nenhum número foi mantido na lista.

## Exercícios

- `AnalisePercurso.java`: leitura de seis inteiros em um array, exibição dos valores, soma e contagem de pares e ímpares.
- `MaiorEMenor.java`: leitura de seis inteiros, exibição dos valores e identificação de maior e menor com comparações, sem métodos prontos para essas duas operações.
- `BuscarNumero.java`: busca sequencial em um array com valores repetidos, exibição de todas as posições encontradas e mensagem quando o número está ausente.
- `BuscaBinaria.java`: exibição do array original, ordenação com `Arrays.sort()` e busca com `Arrays.binarySearch()`, distinguindo índice encontrado de retorno negativo.
- `CidadesArrayList.java`: adição de três cidades, acesso e substituição da segunda, remoção da primeira e exibição da lista final e de sua quantidade.
- `NumerosArrayList.java`: leitura de inteiros até `-1`, armazenamento em lista e apresentação de quantidade, soma, média, maior e menor, com mensagem específica para lista vazia.

## Dúvidas e pontos para continuar praticando

- As dúvidas discutidas durante os exercícios envolveram a impressão de arrays, a inicialização de maior e menor, a diferença entre índice e posição e a verificação de lista vazia.
- Os testes de `AnalisePercurso.java` mostraram que uma soma pode ultrapassar a capacidade de `int`. O exercício utiliza esse tipo para o acumulador.
- Tratamento de exceções ainda não foi estudado nesta etapa, conforme informado durante as validações. Os programas com entrada pelo teclado esperam números inteiros válidos.

## Referências utilizadas

- Curso em Vídeo — Java Básico, informado como curso principal de estudo. Não foi registrado o número da aula correspondente a esta pasta.
- Sequência de seis exercícios sobre arrays e `ArrayList` apresentada e desenvolvida nesta conversa com auxílio de IA para esclarecimentos e validação.
- Discussões e testes registrados nesta conversa: percurso, paridade, inicialização de maior e menor, busca com repetições, ordenação, busca binária, operações com cidades e análise de lista numérica, incluindo o caso vazio.
