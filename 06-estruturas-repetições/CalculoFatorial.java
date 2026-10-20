import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        String continuar;
        do {
            System.out.print("Digite um número: ");
            var numero = teclado.nextInt();
            int fatorial = 1;
            System.out.print(numero + "! = ");
            if (numero == 0) {
                fatorial = 1;
            } else {
                for (int i = 1; i <= numero; i++) {
                    fatorial *= i;
                    if (i == numero) {
                        System.out.print(i + " = ");
                    } else {
                        System.out.print(i + " x ");
                    }
                }
            }
            System.out.println(fatorial);
            while (true) {
                System.out.print("Quer continuar com número diferente? [S/N]: ");
                continuar = teclado.next();
                if (continuar.equalsIgnoreCase("S") ||  continuar.equalsIgnoreCase("N")) {
                    break;
                }
            }
        } while (continuar.equalsIgnoreCase("S"));
    }
}
