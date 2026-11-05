public class ObjetoCaneta {
    public static void main(String[] args) {
        ClasseCaneta caneta01 = new ClasseCaneta();
        // alterando atributos
        caneta01.modelo = "Bic";
        caneta01.cor = "Preta";
        caneta01.ponta = 0.7f;
        caneta01.carga = 70;
        caneta01.tampada = true;
        // métodos possuem parênteses
        caneta01.status();
        caneta01.rabiscar();
        caneta01.destampar();
        caneta01.status();
        caneta01.rabiscar();
    }
}
