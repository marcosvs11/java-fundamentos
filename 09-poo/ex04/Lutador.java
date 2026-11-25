package ex04;

public class Lutador {
    // atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // métodos
    public void apresentar() {
        System.out.println("======APRESENTAÇÃO======");
        System.out.println("Nome: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
        System.out.println("--------------------------------");
    }

    public void status() {
        System.out.println("Lutador " + getNome());
        System.out.print(", peso " + getCategoria());
        System.out.print(", " + getVitorias() + " vitorias, " + getEmpates() + " empates e " + "derrotas " + getDerrotas() + "\n");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
    // construtor
    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
    }

    // métodos especiais
    public String getNome() {
       return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        if (idade <= 0) {
            // interrompe a criação do objeto e informa o motivo
            throw new IllegalArgumentException("Idade deve ser maior que zero");
        }
        this.idade = idade;
    }

    public double getAltura() {
        return this.altura;
    }
    public void setAltura(double altura) {
        if (altura <= 0) {
            // interrompe a criação do objeto e informa o motivo
            throw new IllegalArgumentException("Altura deve ser maior que zero");
        }
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }
    private void setPeso(double peso) {
        // interrompe a criação do objeto e informa o motivo
        if (peso <= 0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero");
        }
        this.peso = peso;
        if (peso <= 50) {
            setCategoria("Inválido");
        } else if (peso <= 70) {
            setCategoria("Leve");
        } else if (peso <= 84) {
            setCategoria("Médio");
        } else if (peso <= 93) {
            setCategoria("Meio-Pesado");
        } else {
            setCategoria("Pesado");
        }
    }

    public String getCategoria() {
        return this.categoria;
    }
    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return this.vitorias;
    }
    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }
    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }
    private void setEmpates(int empates) {
        this.empates = empates;
    }
}
