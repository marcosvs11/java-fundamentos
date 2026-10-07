import java.util.Scanner;

public class DigiteJava {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        String palavraCerta = "Java";
        System.out.print("Digite a palavra certa: ");
        String palavra = teclado.nextLine();
        String resultado = palavra.equals(palavraCerta) ? "ACERTOU!" : "PALAVRA INCORRETA";
//      Utilizar palavra == palavraCerta não é adequado, pois não estaremos comparando o conteúdo,
//      mas sim outra coisa
        System.out.println(resultado);
    }
}