import java.util.Scanner;

public class VerificadorTriangulos {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double primeiroLado = teclado.nextDouble();
        if (primeiroLado > 0) {
            System.out.print("Digite o segundo valor: ");
            double segundoLado = teclado.nextDouble();
            if (segundoLado > 0) {
                System.out.print("Digite o terceiro valor: ");
                double terceiroLado = teclado.nextDouble();
                if (terceiroLado > 0) {
                    if ((primeiroLado + segundoLado > terceiroLado) && (segundoLado + terceiroLado > primeiroLado) && (terceiroLado + primeiroLado > segundoLado)) {
                        System.out.println("Triângulo ENCONTRADO!");
                        System.out.print("Classificação: ");
                        if ((primeiroLado == segundoLado) && (segundoLado == terceiroLado)) {
                            System.out.println("EQUILÁTERO");
                        } else if ((primeiroLado == segundoLado) || (segundoLado == terceiroLado) || (terceiroLado == primeiroLado)) {
                            System.out.println("ISÓSCELES");
                        } else {
                            System.out.println("ESCALENO");
                        }
                    } else {
                        System.out.println("Não é um triâgulo!");
                }
                } else {
                    System.out.println("Medida inválida");
                }
            } else {
                System.out.println("Medida inválida");
            }
        } else {
            System.out.println("Medida inválida!");
        }
    }
}