import java.util.Arrays;
import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        int[] binarios = {7, 4, 1, 5, 2, 9};
        System.out.print("Números armazenados: ");
        for(int i = 0; i < binarios.length; i++) {
            if (i == binarios.length - 1) {
                System.out.print(binarios[i]);
            } else {
                System.out.print(binarios[i] + ", ");
            }
        }
        Arrays.sort(binarios);
        System.out.println();
        System.out.print("Números ordenados: ");
        for (int i =0; i < binarios.length; i++) {
            if (i == binarios.length - 1) {
                System.out.print(binarios[i]);
            } else {
                System.out.print(binarios[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("Digite um número: ");
        var numero = teclado.nextInt();
        int posicao = Arrays.binarySearch(binarios, numero);
        if (posicao < 0) {
            System.out.println("Número não encontrado na busca binária!");
        } else {
            System.out.println("Número encontrado no índice " + posicao + " do array");
        }
    }
}
