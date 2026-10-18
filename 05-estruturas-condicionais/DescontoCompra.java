import java.util.Scanner;

public class DescontoCompra {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        double desconto;
        double valorFinal;
        System.out.print("Digite o valor total da compra: R$");
        double valor = teclado.nextDouble();
        if (valor >= 0) {
            System.out.print("Você é cliente vip (true/false)? ");
            String validacaoClienteVip = teclado.next();
            if ((validacaoClienteVip.equals("true")) || (validacaoClienteVip.equals("false"))) {
                boolean clienteVip = Boolean.parseBoolean(validacaoClienteVip);
                if (valor > 500) {
                    desconto = clienteVip ? 20 : 15;
                } else if (valor >= 250) {
                    desconto = clienteVip ? 15 : 10;
                } else if (clienteVip) {
                    desconto = 5d;
                } else {
                    System.out.println("Nenhum desconto aplicado.");
                    desconto = 0;
                }
                valorFinal = valor - (valor * (desconto / 100));
                System.out.println();
                System.out.println("=========CHECKOUT==========");
                System.out.printf("Valor (%.1f%% OFF): R$%.2f\n", desconto, valorFinal);
            } else {
                System.out.println("Entrada inválida, digite 'true' ou 'false'!");
            }
        } else {
            System.out.println("Entrada inválida, digite um valor positivo!");
        }
    }
}