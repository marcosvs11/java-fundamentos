import java.util.ArrayList;
import java.util.Scanner;

public class MostrarMedia {
    public static double calcularMedia (double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a " + (i + 1) + "° nota: ");
            notas.add(teclado.nextDouble());
        }
        int i = 0;
        for (double resultado: notas) {
            i++;
            System.out.println("Nota da " + i + "° prova: " + resultado);
        }
        double media = calcularMedia(notas.get(0), notas.get(1), notas.get(2));
        System.out.printf("Média final: %.1f ", media);
    }
}
