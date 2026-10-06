import java.util.Scanner;

public class AreaCirculo {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("    CALCULADORA DE ÁREAS");
        System.out.print("Digite o valor do raio: ");
        double raio = teclado.nextDouble();
        double areaCirculo = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círuculo: %.2fcm\n", areaCirculo);
        double circunferencia = 2 * Math.PI * raio;
        System.out.printf("O comprimento da circunferência: %.2fcm\n", circunferencia);
        double areaSemiesfera = 2 * Math.PI * Math.pow(raio, 2);
        System.out.printf("A área da semiesfera: %.2fcm ", areaSemiesfera);
    }
}