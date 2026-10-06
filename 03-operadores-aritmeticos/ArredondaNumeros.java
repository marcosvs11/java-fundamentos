import java.util.Scanner;

public class ArredondaNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double num = teclado.nextDouble();
        System.out.println("Valor absoluto: " + Math.abs(num));
        System.out.println("Arredondamento para baixo: " + Math.floor(num));
        System.out.println("Arredondamento para cima: " + Math.ceil(num));
        System.out.println("Arredondamento aritimética: " + Math.round(num));

    }
}