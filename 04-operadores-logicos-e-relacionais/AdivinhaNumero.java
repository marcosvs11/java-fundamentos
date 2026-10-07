import java.util.Scanner;
import java.util.Random;

public class AdivinhaNumero {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        Random gerador = new Random();
        int sorteado = gerador.nextInt(11);
        System.out.print("Digite um número entre 0 e 10: ");
        int numeroEscolhido = teclado.nextInt();
        String resultado = numeroEscolhido == sorteado ? "Parabéns, adivinhou meu número!" : "Que pena, errou... Estava pensado no " + sorteado;
        System.out.println(resultado);
    }
}