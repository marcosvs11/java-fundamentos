import java.util.Scanner;

public class ReacaoQuimica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantidade de reagentes A: ");
        double chemicalA = teclado.nextDouble();
        System.out.print("Digite a quantidade de reagentes B: ");
        double chemicalB = teclado.nextDouble();
        double reacTlonResult = (chemicalA + chemicalB) / (chemicalA * chemicalB);
        System.out.printf("-> Resultado da reação química = %.4f", reacTlonResult);
    }
}
