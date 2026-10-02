import java.util.Scanner;

public class ItensEmCasa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Quantidade de itens na sala: ");
        int caixaDaSala = teclado.nextInt();
        System.out.print("Quantidade de itens no quarto: ");
        int caixaDoQuarto = teclado.nextInt();
        System.out.print("Quantidade de itens no banheiro: ");
        int caixaDoBanheiro = teclado.nextInt();
        int totalDeItens = caixaDaSala + caixaDoQuarto + caixaDoBanheiro;
        System.out.println("-> Na minha casa tem " + totalDeItens + " itens.");
    }
}