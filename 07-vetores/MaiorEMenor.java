import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        int[] valores = new int[6];
        int maior = 0;
        int menor = 0;
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            valores[i] = teclado.nextInt();
            if (i == 0) {
                maior = valores[i];
                menor = valores[i];
            }
            if (valores[i] > maior) {
                maior = valores[i];
            }
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }
        System.out.print("Números digitados: ");
        for (int i = 0; i < valores.length; i++) {
            if (i == valores.length - 1) {
                System.out.println(valores[i]);
            } else {
                System.out.print(valores[i] + ", ");
            }
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
