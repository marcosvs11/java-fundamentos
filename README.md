# Java Fundamentos

Repositório de aprendizagem em Java. Aqui registro exercícios, anotações e pequenas experiências organizadas por assunto. O objetivo é construir fundamentos e autonomia gradualmente, com interesse atual em desenvolvimento backend.

Concluí as aulas e os exercícios previstos de Java Básico. O próximo conteúdo principal é Programação Orientada a Objetos (POO), pelo Curso em Vídeo. Concluir um curso registra o percurso de estudo; não significa dominar automaticamente cada assunto.

## Como estudo

1. Escolho um assunto e defino o que quero conseguir fazer.
2. Estudo a aula principal e faço experiências pequenas no código.
3. Resolvo exercícios sem acompanhar a solução.
4. Faço uma variação própria ou um exercício complementar.
5. Verifico casos comuns, limites e entradas inválidas quando fizer sentido.
6. Registro dúvidas, aprendizados e a origem dos exercícios no README do assunto.
7. Retomo o conteúdo depois, tentando explicar, adaptar e depurar sem copiar uma solução.

Consultar documentação e pedir explicações fazem parte do aprendizado. Código feito com ajuda serve como material de estudo, mas não é, por si só, evidência de autonomia.

## Organização atual

As pastas seguem a sequência que construí durante os estudos. Os nomes abaixo descrevem o conteúdo; não são uma declaração de domínio.

| Pasta | Conteúdo |
| --- | --- |
| `01-primeiros-passos` | JDK, compilação, execução e primeiros programas |
| `02-variaveis` | Tipos, variáveis e entrada de dados |
| `03-operadores-aritmeticos` | Operações, cálculos e classe `Math` |
| `04-operadores-logicos-e-relacionais` | Comparações, lógica booleana e operador ternário |
| `05-estruturas-condicionais` | `if`, `else`, `switch` e validações |
| `06-estruturas-repetições` | `for`, `while`, `do-while`, contadores e acumuladores |
| `07-vetores` | Arrays, percursos e `ArrayList` |
| `08-métodos` | Parâmetros, retorno e decomposição de problemas |

Os arquivos de cada assunto ficam na pasta correspondente. Não mantenho uma sequência paralela de pastas por plataforma; registro a origem do exercício no README do assunto. Assim, materiais do Curso em Vídeo, Codédex, DIO e exercícios autorais podem praticar o mesmo tema juntos.

Novas pastas serão criadas quando eu começar um conteúdo e tiver material para registrar. POO é o próximo assunto. Coleções, exceções, arquivos, testes e ferramentas de build serão organizados conforme avançarem os estudos, sem criar pastas vazias para uma trilha distante.

## Ambiente e execução

Confiro as versões instaladas com:

```bash
java --version
javac --version
```

O JDK 25 LTS é a versão-alvo planejada. Alguns exercícios usam uma forma simplificada do método de entrada, como `static void main(String[] args)` sem `public`, aceita a partir do Java 25. Portanto, o JDK 21 pode não executar todos os arquivos nesse formato. Se eu quiser manter compatibilidade com versões anteriores, devo usar a assinatura tradicional `public static void main(String[] args)` nesses exercícios.

Para executar um arquivo isolado, sem pacote ou dependências, posso usar o modo de arquivo-fonte, a partir da raiz:

```bash
java 05-estruturas-condicionais/ParOuImpar.java
```

Também posso compilar e executar explicitamente:

```bash
javac -d out 05-estruturas-condicionais/ParOuImpar.java
java -cp out ParOuImpar
```

O diretório `out` contém arquivos gerados e não deve ser versionado. Exercícios com mais de uma classe ou dependências precisam de instruções próprias quando essa necessidade surgir.

## Padrões de organização

- Pastas usam numeração e nomes descritivos, seguindo a sequência real de estudo.
- Classes usam `PascalCase`; métodos e variáveis usam `camelCase`; nomes de pacotes, quando utilizados, ficam em minúsculas.
- Explicações e anotações ficam em português; nomes no código podem ficar em inglês quando isso for mais claro.
- Exercícios independentes usam nomes de classe distintos, em vez de várias classes chamadas `Main`.
- O código-fonte e as instruções ficam no Git; configurações locais e arquivos compilados ficam fora.
- Cada README de assunto registra objetivo, referências, exercícios, origem, dúvidas e verificações relevantes. Uso o [modelo de tópico](MODELO-TOPICO.md) como ponto de partida e preencho apenas as seções úteis.

## Referências de estudo

| Referência | Uso |
| --- | --- |
| [Curso em Vídeo: Java Básico](https://www.cursoemvideo.com/curso/java-basico/) | Trilha principal concluída para os fundamentos |
| [Curso em Vídeo: Java POO](https://www.cursoemvideo.com/curso/java-poo/) | Próxima trilha principal |
| [Codédex: Java](https://www.codedex.io/java) | Exercícios e explicações complementares |
| [DIO](https://www.dio.me/) | Cursos e conteúdos complementares de Java |
| [Dev.java](https://dev.java/learn/) | Documentação e tutoriais oficiais da linguagem |

Usarei um curso principal e fontes complementares conforme a necessidade, sem tentar concluir várias trilhas equivalentes ao mesmo tempo. As partes de interface gráfica podem ser retomadas mais tarde; o foco atual é linguagem, POO e programas de terminal.

Referências para etapas posteriores:

- [JUnit](https://docs.junit.org/current/user-guide/): testes automatizados.
- [Maven](https://maven.apache.org/guides/getting-started/): dependências e build.
- [Tutorial do PostgreSQL](https://www.postgresql.org/docs/current/tutorial.html): fundamentos de SQL e banco de dados.
- [Spring: serviço REST](https://spring.io/guides/gs/rest-service/): primeira API, depois da base de Java, SQL e HTTP.

## Como avalio meu progresso

Antes de considerar um assunto consolidado, procuro conseguir:

- Explicar a ideia com minhas palavras e dar um exemplo.
- Resolver uma pequena variação sem copiar uma resposta pronta.
- Identificar um erro, entender a causa e verificar a correção.
- Retomar o assunto em outro dia e ainda conseguir aplicá-lo.

Posso avançar com dúvidas registradas e revisá-las depois. Não preciso dominar todos os detalhes de uma API antes de continuar o percurso.

## Projetos

As [ideias de implementação](IDEIAS.md) conectam os assuntos a problemas concretos. Escolho uma ideia por vez, começando por um escopo pequeno. Projetos que crescerem e precisarem de estrutura, dependências, testes ou instruções próprias poderão ter um repositório separado.