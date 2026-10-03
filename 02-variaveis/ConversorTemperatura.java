import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a temperatura em graus: ");
        double temperaturaGraus = teclado.nextDouble();
        System.out.printf("A temperatura em graus = %.1f°\n", temperaturaGraus);
        double temperaturaFahrenheit = ((temperaturaGraus * 9) / 5) + 32;
        System.out.printf("Convertida em Fahrenheit = %.1fF", temperaturaFahrenheit);
    }
}