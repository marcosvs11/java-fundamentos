import java.util.Scanner;

public class ComprasMercado {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor do 1° produto: R$");
        double produto1 = teclado.nextDouble();
        System.out.print    ("Digite a quantidade do 1° produto: ");
        int quantidade1 = teclado.nextInt();
        System.out.print("Digite o valor do 2° produto: R$");
        double produto2 = teclado.nextDouble();
        System.out.print("Digite a quantidade do 2° produto: ");
        int quantidade2 = teclado.nextInt();
        System.out.print("Digite o valor do 3° produto: R$");
        double produto3 = teclado.nextDouble();
        System.out.print("Digite a quantidade do 3° produto: ");
        int quantidade3 = teclado.nextInt();
        double total = (produto1 * quantidade1) + (produto2 * quantidade2) + (produto3 * quantidade3);
        System.out.printf("-> Total da compra: R$%.2f", total);
    }
}