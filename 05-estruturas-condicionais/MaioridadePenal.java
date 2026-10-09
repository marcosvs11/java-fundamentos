import java.util.Scanner;

public class MaioridadePenal {
    static void main(String[] args) {
        var teclado = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();
        if (idade >= 18) {
            System.out.println("MAIOR de idade DETECTADO!");
        } else {
            System.out.println("MENOR de idade DETECTADO!");
        }
    }
}