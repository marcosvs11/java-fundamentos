package ex05.test;

import ex05.dominio.Livro;
import ex05.dominio.Pessoa;
import java.util.ArrayList;

public class PessoaTest01 {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Marcos", 19, 'M'));
        pessoas.add(new Pessoa("Mayla", 19, 'F'));
        System.out.println(pessoas.get(1).imprime());

        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(new Livro("Memórias do Subsolo", "Dostoievski", 189, pessoas.get(1)));
        System.out.println(livros.get(0).maisDetalhes());
        livros.add(new Livro("Meditações", "Marco Aurélio", 210, pessoas.get(0)));
        System.out.println(livros.get(1).maisDetalhes());

        pessoas.get(1).fazerAniversario();
        System.out.println(pessoas.get(1).imprime());

        livros.get(1).abrir();
        System.out.println(livros.get(1).maisDetalhes());

        livros.get(1).voltarPag();
        System.out.println(livros.get(1).maisDetalhes());
        livros.get(1).folhear(210);
        livros.get(1).avancarPag();
        System.out.println(livros.get(1).maisDetalhes());

    }
}
