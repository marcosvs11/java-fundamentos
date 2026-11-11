public class ContaBancoVieira {
    public static void main(String[] args) {
        BancoVieira contaMarcos = new BancoVieira();
        BancoVieira contaLivia = new BancoVieira();
        contaLivia.abrirConta();
        contaMarcos.getSaldo();
        contaLivia.pagarMensal();
    }
}
