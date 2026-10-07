import java.util.Scanner;

public class VerifiqueDesconto {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();
        String temDesconto = idade <= 12 ^ idade >= 60 ? "Desconto ADQUIRIDO!" : "Não possui desconto!";
        System.out.println(temDesconto);
    }
}