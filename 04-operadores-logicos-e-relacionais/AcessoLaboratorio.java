import java.util.Scanner;

public class AcessoLaboratorio {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Você está matriculada? (true/false): ");
        boolean matricula = teclado.nextBoolean();
        System.out.print("Tem horário agendado? (true/false): ");
        boolean agendamento = teclado.nextBoolean();
        System.out.print("Você é funcionária? (true/false): ");
        boolean funcionaria = teclado.nextBoolean();
        String resultado = matricula && (agendamento || funcionaria) ? "Acesso LIBERADO!" : "Acesso NEGADO!";
        System.out.println("resultado = " + resultado);
    }
}