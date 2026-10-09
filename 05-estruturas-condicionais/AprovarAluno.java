import java.util.Scanner;

public class AprovarAluno {
    static void main(String[] args) {
        var teclado = new Scanner(System.in);
        double frequenciaMinima = 75.0d;
        double notaMinima = 7.0d;
        System.out.print("Digite a sua nota 01: ");
        double primeiraNota = teclado.nextDouble();
        System.out.print("Digite a sua nota 02: ");
        double segundaNota = teclado.nextDouble();
        System.out.print("Digite a sua frequência em porcentagem: ");
        double alunoFrequencia = teclado.nextDouble();
        double alunoMedia = (primeiraNota + segundaNota) / 2d;
        System.out.println();
        System.out.println("    RESULTADO");
        System.out.printf("Média: %.2f | mín. %.2f\n", alunoMedia, notaMinima);
        System.out.printf("Frequência: %.1f%% | mín. %.1f%%\n", alunoFrequencia, frequenciaMinima);
        if (alunoFrequencia >= frequenciaMinima && alunoMedia >= notaMinima) {
            System.out.println("Situação: APROVADO");
        } else {

            System.out.println("Situação: REPROVADO");
        }
    }
}