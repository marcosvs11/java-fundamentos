import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        if (numero > 0) {
            System.out.println("Número positivo DETECTADO!");
        }
        System.out.println("Programa encerrado...");
    }
}