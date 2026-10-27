import java.util.Scanner;

public class BuscarNumero {
    public static void main(String[] args) {
        int [] bancoNumeros = {5, 1, 5, 3, 2, 9};
        var teclado = new Scanner(System.in);
        boolean encontrado = false;
        System.out.print("Digite um número (0-11): ");
        var numero = teclado.nextInt();
        for (int i = 0; i < bancoNumeros.length; i++) {
            if (numero == bancoNumeros[i]){
                System.out.println("Número encontrado na posição: " + (i + 1) + "°");
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("Número não registrado no banco de dados!");
        }

    }
}
