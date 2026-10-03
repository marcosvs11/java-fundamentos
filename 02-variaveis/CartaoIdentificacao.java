import java.util.Scanner;

public class CartaoIdentificacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a sua idade: ");
        int idade = teclado.nextInt();
        System.out.print("Digite a inicial do seu sobrenome: ");
        char inicialSobrenome = teclado.next().charAt(0);
        System.out.print("Digite a sua altura: ");
        double altura = teclado.nextDouble();
        System.out.print("Está matriculada? (true/false): ");
        boolean matriculada = teclado.nextBoolean();
        System.out.println("-> Cartão de Identificação:");
        System.out.println("    Nome: " + nome);
        System.out.println("    Idade: " + idade);
        System.out.println("    Inicial do sobrenome: " + inicialSobrenome);
        System.out.println("    Altura: " + altura);
        System.out.println("    Matriculada: " + matriculada);
    }
}

