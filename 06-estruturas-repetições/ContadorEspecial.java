import java.util.Scanner;

public class ContadorEspecial {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String continuar;
        do {
            while (true) {
                System.out.print("Digite o número de início: ");
                var numInicio = teclado.nextInt();
                System.out.print("Digite o número final: ");
                var numFinal = teclado.nextInt();
                System.out.print("Digite o número para o passo: ");
                var passo = teclado.nextInt();
                if (passo == 0) {
                    System.out.println("Entrada inválida, o 'passo' não pode ser zero!");
                    continue;
                }
                if (numInicio > numFinal && passo > 0) {
                    System.out.println("Contagem não realizada porque o inicio (" + numInicio + ") é maior que o final (" + numFinal + "), então o valor 'passo' necessita ser negativo!");
                    continue;
                }
                if (numInicio < numFinal && passo < 0) {
                    System.out.println("Contagem não realizada porque o início (" + numInicio + ") é menor que o final (" + numFinal + "), então o valor do 'passo' necessita ser positivo!");
                    continue;
                }
                System.out.println("Iniciando a contagem: ");
                if (numInicio == numFinal) {
                    System.out.println(numInicio);
                } else if (numInicio <= numFinal) {
                    for (int i = numInicio; i <= numFinal; i += passo) {
                        System.out.print(i + " -> ");
                    }
                } else {
                    for (int i = numInicio; i >= numFinal; i += passo) {
                        System.out.print(i + " -> ");
                    }
                }
                while (true) {
                    System.out.print("Quer continuar? [S/N]: ");
                    continuar = teclado.next();
                    if (continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("N")) {
                        break;
                    } else {
                        System.out.println("Entrada inválida, tente novamente!");
                    }
                }
                break;
            }
        } while (continuar.equalsIgnoreCase("S"));
        System.out.println("Desligando...");
    }
}
