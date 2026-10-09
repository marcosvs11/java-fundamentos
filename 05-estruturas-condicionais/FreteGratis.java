import java.util.Scanner;

public class FreteGratis {
    static void main(String[] args) {
        var teclado = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valor = teclado.nextDouble();
        System.out.print("Você é cliente VIP? (true/false): ");
        boolean clienteVip = teclado.nextBoolean();
        double valorMinimo = 150.0d;
        if (valor >= valorMinimo || clienteVip) {
            System.out.println("Condições atingidas para FRETE GRÁTIS!");
        } else {
            System.out.println("Condições não foram atingidas!");
        }

    }
}