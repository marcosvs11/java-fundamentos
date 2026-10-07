import java.util.Scanner;

public class NumeroMaior {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o 1° número: ");
        int num1 = teclado.nextInt();
        System.out.print("Digite o 2° número: ");
        int num2 = teclado.nextInt();
        int maior = num1 > num2 ? num1 : num2;
        String descricao = num1 == num2 ? "(Ambos com o mesmo valor)" : "(Números diferentes)";
        System.out.println("Maior número: " + maior + " " + descricao);
    }
}