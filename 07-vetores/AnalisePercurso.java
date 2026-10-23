import java.util.Scanner;

public class AnalisePercurso {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        int[] numeros = new int[6];
        int soma = 0;
        int contadorPares = 0;
        int contadorImpares = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + "° número: ");
            numeros[i] = teclado.nextInt();
        }
        System.out.print("Número digitados: ");
        for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                System.out.println(numeros[i]);
            } else System.out.print(numeros[i] + ", ");
            soma += numeros[i];
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else contadorImpares++;

        }
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Quantidade de pares: " + contadorPares);
        System.out.println("Quantidade de ímpares: " + contadorImpares);
    }
}
