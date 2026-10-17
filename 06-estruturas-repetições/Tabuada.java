import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        String continuar;
        // while (continuar.equals("s")) {
        do {
            System.out.print("Digite um número: ");
            int numero = teclado.nextInt();
            System.out.println("======================");
            System.out.println("    TABUADA DO " + numero);
            System.out.println("======================");
            for (int i = 1; i <= 10; i++) {
                int multiplicacao = numero * i;
                System.out.printf("     %d x %d = %d\n", numero, i, multiplicacao);
            }
            while (true) {
                System.out.print(">>> Quer continuar? [s/n]: ");
                continuar = teclado.next().toLowerCase();
                if (continuar.equals("n")) {
                    System.out.println(">>> Desligando...");
                    break;
                } else if (continuar.equals("s")) {
                    System.out.println(">>> Reiniciando...");
                    System.out.println();
                    break;
                } else {
                    System.out.println(">>> Opção inválida, tente novamente!");
                }
            }
        } while (continuar.equals("s"));
    }
}