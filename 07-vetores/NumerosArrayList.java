import java.util.ArrayList;
import java.util.Scanner;

public class NumerosArrayList {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        boolean flagEncontrado = false;

        double media = 0;
        double soma = 0;

        int condicaoParada = -1;
        int maior = 0;
        int menor = 0;
        int quantidade = 0;

        do {
            System.out.print("Digite um número(-1 para interromper): ");
            numeros.add(teclado.nextInt());
            int ultimoElemento = (numeros.size() - 1);

            if (numeros.size() == 1) {
                maior = numeros.get(0);
                menor = numeros.get(0);
            }

            if (numeros.get(ultimoElemento) == condicaoParada) {
                flagEncontrado = true;
                numeros.remove(ultimoElemento);
            } else {
                soma += numeros.get(ultimoElemento);
                if (numeros.get(ultimoElemento) > maior) {
                    maior = numeros.get(ultimoElemento);
                }
                if (numeros.get(ultimoElemento) < menor) {
                    menor = numeros.get(ultimoElemento);
                }
                quantidade++;
            }
        } while (!flagEncontrado);
        if (!numeros.isEmpty()) {
            media = soma / quantidade;
            System.out.println("Quantidade de números: " + quantidade);
            System.out.println("Soma: " + soma);
            System.out.printf("Média: %.1f\n", media);
            System.out.println("Maior número: " + maior);
            System.out.println("Menor número: " + menor);
        } else {
            System.out.println("Nenhum número digitado!");
        }
    }
}
