package ex05.dominio;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberta;
    private Pessoa leitor;

    public String maisDetalhes() {
        return "Livro { " +
            "Titulo = '" + titulo + '\'' +
            ",\n Autor = '" + autor + '\'' +
            ",\n Total de paginas = " + totPaginas +
            ",\n Página Atual = " + pagAtual +
            ",\n Aberta = " + aberta +
            ",\n Leitor = " + leitor.getNome() +
            ",\n Gênero = " + leitor.getSexo() +
             '}' + "\n";
    }

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberta = false;
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (aberta) {
            System.out.println("O livro já está aberto");
            return;
        }
        aberta = true;
    }

    @Override
    public void fechar() {
        if (!aberta) {
            System.out.println("O livro já está fechado");
            return;
        }
        aberta = false;
    }

    @Override
    public void folhear(int pagina) {
        if (aberta) {
            if (pagina < 0 || pagina > totPaginas) {
                System.out.println("Número da página inválido");
                return;
            }
        } else {
            System.out.println("Não tem como folhear com o livro fechado");
            return;
        }
        pagAtual = pagina;
    }

    @Override
    public void avancarPag() {
        if (aberta) {
            if (pagAtual == totPaginas) {
                System.out.println("O livro chegou ao fim");
                return;
            }
        } else {
            System.out.println("Não tem como avançar a página com o livro fechado");
            return;
        }
        pagAtual++;
    }

    @Override
    public void voltarPag() {
        if (aberta) {
            if (pagAtual == 0) {
                System.out.println("O livro não tem mais paginas anteriores");
                return;
            }
        } else {
            System.out.println("Não tem como voltar a página com o livro fechado");
            return;
        }
        pagAtual--;
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String autor() {
        return autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberta() {
        return aberta;
    }

    private void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
