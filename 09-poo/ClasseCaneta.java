public class ClasseCaneta {
    // atributos da minha classe
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //métodos da minha classe (não retorna valor = void)
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Espessura: " + this.ponta);
        System.out.println("Carga atual: " + this.carga + "%");
        System.out.println("Está tampada?: " + this.tampada);
    }
    // this permite executar/alterar apenas o objeto que chamou pelo método
    // referência ao objeto

    void rabiscar() {
        if (this.tampada){
            System.out.println("Erro, caneta tampada!");
        } else {
            System.out.println("Estou RABISCANDO...");
        }
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;
    }
}
