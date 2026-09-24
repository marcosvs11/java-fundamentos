# Java Fundamentos

Repositório de estudos de Java, com exercícios organizados por assunto, anotações e pequenos projetos.

Comecei com Portugol e Python para desenvolver minha lógica de programação. Depois de concluir meu primeiro projeto em Python, o Financial Ledger, estou direcionando os estudos para Java e orientação a objetos, com o objetivo de atuar no desenvolvimento backend.

Este repositório registra meu aprendizado. Os assuntos abaixo são uma trilha planejada e não representam conhecimentos já dominados.

## Como estudo

1. Escolho um assunto e defino o que quero conseguir fazer com ele.
2. Assisto à aula correspondente do curso principal e faço pequenas experiências no código.
3. Resolvo os exercícios da aula sem acompanhar a solução.
4. Pratico uma variação própria ou um exercício complementar do mesmo assunto.
5. Verifico casos comuns, limites e entradas inválidas quando fizer sentido.
6. Registro uma dificuldade, o que aprendi e a origem dos exercícios.
7. Retomo um exercício em outro dia, sem consultar a solução anterior.

O objetivo é conseguir explicar, adaptar e depurar o código. Consultar documentação faz parte do processo; copiar uma solução não substitui a prática.

## Trilha de estudos

Criarei cada pasta quando começar o assunto. Não é necessário abrir todas de uma vez.

| Pasta planejada | Conteúdo principal | Evidência de aprendizado |
| --- | --- | --- |
| `01-primeiros-passos` | JDK, compilação, execução, saída e erros básicos | Executar um programa próprio e explicar o papel do JDK |
| `02-tipos-e-operadores` | Tipos, variáveis, entrada, conversões e operadores | Ler dados e realizar cálculos entendendo os tipos usados |
| `03-condicionais` | `if`, `else`, `switch` e expressões booleanas | Resolver uma decisão com casos de fronteira |
| `04-repeticao` | `for`, `while`, `do-while` e acumuladores | Construir um menu e explicar a condição de parada |
| `05-arrays-e-strings` | Arrays, índices, percursos e operações com texto | Processar dados sem acessar índices inválidos |
| `06-metodos` | Parâmetros, retorno, escopo e decomposição | Dividir um problema em métodos com responsabilidades claras |
| `07-classes-e-objetos` | Estado, comportamento, construtores e encapsulamento | Modelar uma classe e proteger suas regras |
| `08-composicao-e-polimorfismo` | Composição, interfaces, herança e polimorfismo | Justificar a relação entre classes com um exemplo próprio |
| `09-colecoes-e-excecoes` | `List`, `Set`, `Map`, generics básicos e exceções | Escolher uma coleção e tratar erros esperados |
| `10-arquivos-datas-e-valores` | Arquivos, `java.time` e `BigDecimal` | Persistir dados e lidar com datas e valores monetários |
| `11-testes-e-build` | JUnit, Maven e organização de projetos | Executar testes de regras de negócio de forma repetível |

Testes manuais e depuração serão praticados desde o início. JUnit e Maven entram depois, quando houver métodos e classes úteis para testar.

Após essa base: SQL, HTTP/JSON e uma API com Spring Boot em um repositório de projeto. Este repositório continuará dedicado aos fundamentos e às revisões.

## Organização de cada assunto

Exemplo de caminhos para uma pasta de estudo:

```text
03-condicionais/README.md
03-condicionais/exercicios/Ex01ClassificarNota.java
03-condicionais/exercicios/Ex02CompararValores.java
```

Esses nomes são exemplos, não exercícios já implementados. Cada programa inicial será independente e terá um nome de classe igual ao nome do arquivo, respeitando maiúsculas e minúsculas.

O README do assunto terá objetivo, referências, exercícios, testes relevantes e dúvidas. Usarei o [modelo de tópico](MODELO-TOPICO.md) como ponto de partida, preenchendo apenas o que for útil.

Não organizarei uma segunda sequência de pastas por plataforma: a origem ficará registrada ao lado do exercício. Assim, exercícios do Curso em Vídeo, do Codédex e desafios próprios poderão estudar o mesmo conteúdo juntos.

## Ambiente e execução

Ambiente planejado: JDK 25 LTS e o IDE Intellij IDEA. Se o JDK 21 já estiver configurado, ele atende a esta trilha inicial; não é necessário mudar apenas para começar. Registrarei aqui a versão realmente utilizada após configurar o ambiente.

Verificar o ambiente:

```bash
java --version
javac --version
```

Para um exercício inicial de arquivo único, sem declaração de pacote nem dependências, o comando abaixo pode ser executado na raiz do repositório, depois de criar o arquivo do exemplo:

```bash
java 03-condicionais/exercicios/Ex01ClassificarNota.java
```

Também estudarei o processo explícito de compilação e execução:

```bash
javac -d out 03-condicionais/exercicios/Ex01ClassificarNota.java
java -cp out Ex01ClassificarNota
```

No início, usarei a estrutura tradicional de classe com `public static void main(String[] args)`, sem recursos de prévia. Projetos com várias classes terão suas próprias instruções de execução. Quando começar pacotes e Maven, adotarei a estrutura apropriada para esses projetos.

## Padrões de organização

- Pastas de assuntos: numeração e nomes descritivos, como `03-condicionais`.
- Classes: `PascalCase`; métodos e variáveis: `camelCase`; pacotes, quando utilizados: nomes em minúsculas.
- Nomes no código preferencialmente em inglês; explicações em português. Clareza é mais importante que traduções forçadas.
- Evitar várias classes chamadas `Main` no mesmo pacote. Usar nomes distintos nos exercícios independentes.
- Manter códigos-fonte e instruções no Git; deixar arquivos compilados e configurações locais fora do versionamento.
- Fazer commits com mudanças compreensíveis. Exemplos: `docs: organize Java study roadmap` e `feat: add conditional exercises`.
- Criar branches quando ajudarem a organizar uma mudança maior. Não é necessário um pull request para cada exercício isolado.

## Referências e quando usar

| Referência | Papel no estudo |
| --- | --- |
| [Curso em Vídeo: Java Básico](https://www.cursoemvideo.com/curso/java-basico/) | Sequência principal para fundamentos; priorizar os conteúdos de linguagem |
| [Curso em Vídeo: Java POO](https://www.cursoemvideo.com/curso/java-poo/) | Sequência principal após métodos e fundamentos |
| [Dev.java](https://dev.java/learn/) | Documentação e tutoriais oficiais para dúvidas e recursos da linguagem |
| [Codédex: Java](https://www.codedex.io/java) | Exercícios complementares do assunto atual, conforme o conteúdo disponível no meu acesso |
| [Exercism: Java](https://exercism.org/tracks/java) | Alternativa de prática com exercícios e testes; não precisa ser usado junto com o Codédex em toda sessão |

Usarei um curso principal e uma fonte complementar por vez. As partes de interface gráfica podem ser retomadas depois; o foco inicial é linguagem, orientação a objetos e programas de terminal. Para instalação e diferenças de versão, consultarei a documentação atual.

Referências para etapas posteriores:

- [JUnit](https://docs.junit.org/current/user-guide/): testes automatizados.
- [Maven](https://maven.apache.org/guides/getting-started/): dependências e build.
- [Tutorial do PostgreSQL](https://www.postgresql.org/docs/current/tutorial.html): fundamentos de SQL e banco de dados.
- [Spring: serviço REST](https://spring.io/guides/gs/rest-service/): primeira API, depois da base de Java e HTTP.

## Critérios para avançar

Antes de considerar um assunto consolidado, preciso conseguir:

- Explicar a ideia com minhas palavras e dar um exemplo.
- Resolver uma pequena variação sem copiar uma resposta pronta.
- Identificar um erro e verificar a correção.
- Retomar o assunto em outro dia e ainda conseguir aplicá-lo.

Posso avançar com dúvidas registradas e revisá-las depois. Não preciso dominar todos os detalhes de uma API para seguir estudando.

## Projetos e progresso

As [ideias de implementação](IDEIAS.md) ligam os conteúdos a problemas concretos. Trabalharei em uma ideia por vez, começando por um escopo pequeno.

- [ ] Configurar e registrar o ambiente.
- [ ] Consolidar fundamentos e métodos.
- [ ] Aplicar classes, encapsulamento, composição e interfaces.
- [ ] Utilizar coleções, exceções e persistência.
- [ ] Concluir um pequeno projeto Java com testes e instruções de execução.

Atualizarei estas marcações com base no que conseguir demonstrar. O progresso será registrado nos READMEs dos assuntos, sem necessidade de um relatório extenso para cada exercício.
