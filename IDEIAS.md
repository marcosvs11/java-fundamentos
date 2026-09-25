# Ideias de implementação

Estas ideias são propostas de prática. Não representam projetos concluídos nem tarefas que preciso começar ao mesmo tempo.

## 1. Resumo de notas no terminal

**Quando:** após condicionais, repetição, arrays e métodos.

**Objetivo:** transformar um problema pequeno em partes que consigo explicar.

**Primeira versão:** receber notas de uma turma pequena, calcular média, maior e menor nota e classificar resultados por uma regra documentada.

**Regras a decidir antes de programar:** intervalo permitido, critério de aprovação e comportamento quando não há notas.

**Verificações:** uma nota, várias notas iguais, nota no limite de aprovação e valor fora do intervalo.

**Concluído quando:** os resultados conferem com cálculos manuais, o programa executa pelas instruções e consigo alterar uma regra sem reescrever tudo.

**Fora do escopo inicial:** interface gráfica, banco de dados, login e relatórios em PDF.

## 2. Catálogo de livros e empréstimos

**Quando:** após classes, encapsulamento, composição e coleções.

**Objetivo:** aprender modelagem com um problema diferente do projeto em Python.

**Primeira versão:** cadastrar livros, listar disponíveis, registrar e devolver um empréstimo, mantendo dados em memória.

**Regras a decidir:** como identificar livros e leitores; se um mesmo livro pode ter dois empréstimos ativos; o que fazer ao devolver um livro que não está emprestado.

**Verificações:** empréstimo válido, tentativa de emprestar livro indisponível, devolução e consulta de catálogo vazio.

**Concluído quando:** as regras ficam protegidas por métodos, em vez de depender apenas do menu; há testes das regras principais e instruções de execução.

**Evolução posterior:** persistência e datas de vencimento. Não criar uma hierarquia de herança apenas para usar herança.

## 3. Financial Ledger em Java

**Quando:** após POO, coleções, exceções, arquivos e testes.

**Objetivo:** reaproveitar os requisitos que já conheço para comparar decisões entre Python e Java.

**Primeira versão:** registrar receitas e despesas, listar transações e calcular saldo. Começar em memória; adicionar persistência em uma segunda etapa.

**Decisões:** representar dinheiro com `BigDecimal`; definir validação, casas decimais e comportamento para dados inválidos; separar cálculo do menu e da gravação.

**Verificações:** nenhuma transação, só despesas, receitas e despesas, valores decimais e tentativas inválidas. Calcular os resultados esperados antes de rodar.

**Concluído quando:** regras principais têm testes automatizados, os dados persistidos podem ser lidos novamente e outra pessoa consegue executar o projeto pelo README.

**Atenção ao aprendizado:** reimplementar os requisitos em Java; não traduzir cada linha de Python mecanicamente. O catálogo de livros e este projeto são alternativas: escolher um primeiro.

## 4. API de transações

**Quando:** após um projeto Java pequeno, SQL e fundamentos de HTTP/JSON.

**Objetivo:** dar o primeiro passo em backend web com Spring Boot.

**Primeira versão:** cadastrar e consultar transações, obter resumo e persistir em banco relacional. Documentar entradas, respostas e erros.

**Concluído quando:** existe um caminho completo de requisição, validação, regra de negócio e persistência; os testes cobrem sucesso e falhas relevantes; o README explica como executar e consultar a API.

**Fora do escopo inicial:** microsserviços, Kubernetes, mensageria, pagamentos reais e autenticação complexa. Avaliar cada nova ferramenta quando aparecer uma necessidade concreta.

## Como escolher uma ideia

1. Escolher uma ideia compatível com o assunto atual.
2. Escrever três ou quatro comportamentos da primeira versão.
3. Definir entradas, saídas e exemplos verificáveis.
4. Implementar um comportamento de cada vez.
5. Registrar o que falta separadamente, sem aumentar o escopo no meio da versão.
6. Encerrar a versão quando os critérios forem atendidos e então escolher a próxima melhoria.

Projetos maiores poderão ter um repositório próprio. Este arquivo pode receber o link quando eles existirem.