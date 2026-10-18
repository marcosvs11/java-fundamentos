import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        String continuar;
        int totalValores = 0;
        int numerosPares = 0;
        int numerosImpares = 0;
        int maioresCem = 0;
        int contador = 0;
        double media;
        Scanner teclado = new Scanner(System.in);
        do {
            while (true) {
                System.out.print("Digite um número: ");
                var numero = teclado.nextInt();
                if (numero < 0) {
                    System.out.println("Operação inválida, número negativo detectado!");
                    continue;
                } else {
                    while (true) {
                        System.out.print("Quer digitar mais? [S/N]: ");
                        continuar = teclado.next();

                        if (continuar.equalsIgnoreCase("S") || (continuar.equalsIgnoreCase("N"))) {
                            break;
                        } else {
                            System.out.println("Opção inválida, tente novamente!");
                        }
                    }
                    contador++;
                    totalValores += numero;
                    numerosPares = (((numero % 2 == 0) ? (numerosPares + numero) : (numerosPares)));
                    numerosImpares = (((numero % 2 == 1) ? (numerosImpares + numero) : (numerosImpares)));
                    if (numero > 100) {
                        maioresCem++;
                    }
                    media = (double) totalValores / contador;
                }
                break;
            }
        } while (continuar.equalsIgnoreCase("S"));
        System.out.println("Carregando resultados...");
        System.out.println();
        System.out.println("    =====RESULTADO=====");
        System.out.println("Soma dos números: " + totalValores);
        System.out.println("Soma dos números pares: " + numerosPares);
        System.out.println("Soma dos números ímpares: " + numerosImpares);
        System.out.println("Quantidade de números maiores que 100: " + maioresCem);
        System.out.printf("A média dos números: %.1f", media);
    }
}
