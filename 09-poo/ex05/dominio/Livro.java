package ex05.dominio;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberta;
    private Pessoa leitor;

    public String maisDetalhes() {
        return "Livro{" +
            "titulo='" + titulo + '\'' +
            ", autor='" + autor + '\'' +
            ", totPaginas=" + totPaginas +
            ", aberta=" + aberta +
            ", leitor=" + leitor +
            '}';
    }

    public Livro(String autor, String titulo, int totPaginas, Pessoa leitor) {
        this.autor = autor;
        this.titulo = titulo;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberta = false;
        this.leitor = leitor;

    }

    @Override
    public void abrir(boolean abrir) {
        aberta = true;
    }

    @Override
    public void fechar(boolean fechar) {
        aberta = false;
    }

    @Override
    public void folhear(int pagina) {
        pagAtual = pagina;
    }

    @Override
    public void avancarPag() {
        pagAtual++;
    }

    @Override
    public void voltarPag() {
        pagAtual--;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String autor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
