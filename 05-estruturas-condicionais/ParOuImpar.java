import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Este número é PAR!");
        } else {
            System.out.println("Este número é IMPAR!");
        }

    }
}