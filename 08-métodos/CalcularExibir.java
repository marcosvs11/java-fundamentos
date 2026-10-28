import java.util.Scanner;

public class CalcularExibir {
    public static boolean ehPar (int a) {
        return a % 2 == 0;
    }
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = teclado.nextInt();
        boolean valorPar = ehPar(valor);
        if (valorPar) {
            System.out.println("Número par encontrado!");
        } else {
            System.out.println("Número ímpar identificado!");
        }
    }
}
