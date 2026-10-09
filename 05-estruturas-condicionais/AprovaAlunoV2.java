import java.util.Scanner;

public class AprovaAlunoV2 {
    public static void main(String[] args) {
        var teclado = new Scanner (System.in);
        double mediaMinima = 7d;
        double frequenciaMinima = 75d;
        System.out.print("Digite a sua primeira nota: ");
        double primeiraNota = teclado.nextDouble();
        if (primeiraNota >= 0 && primeiraNota <= 10 ) {
            System.out.print("Digite a sua segunda nota: ");
            double segundaNota = teclado.nextDouble();
            if (segundaNota >= 0 && segundaNota <= 10) {
                System.out.print("Digite a sua frenquência: ");
                double frequenciaAluno = teclado.nextDouble();
                if (frequenciaAluno >= 0 && frequenciaAluno <= 100) {
                    double mediaAluno = (primeiraNota + segundaNota) / 2;
                    System.out.println();
                    System.out.println("RESULTADO DAS AVALIAÇÕES");
                    System.out.printf("    Nota 1 -> %.2f\n", primeiraNota);
                    System.out.printf("    Nota 2 -> %.2f\n", segundaNota);
                    System.out.printf("    Média final -> %.2f | Média mínima -> %.2f\n", mediaAluno, mediaMinima);
                    System.out.printf("    Frequência -> %.2f | Frequência mínima -> %.2f\n", frequenciaAluno, frequenciaMinima);
                    if (frequenciaAluno >= frequenciaMinima) {
                        if (mediaAluno >= mediaMinima) {
                            System.out.println("    Situação -> APROVADO");
                        } else if (mediaAluno >= 5 && mediaAluno < mediaMinima) {
                            System.out.println("    Situação -> RECUPERAÇÃO ");
                        } else {
                            System.out.println("    Situação -> REPROVADO");
                            System.out.println("    Motivo -> Aluno não obteve MÉDIA suficiente para ser aprovado.");
                        }
                    } else {
                        System.out.println("    Situação -> REPROVADO");
                        if (mediaAluno < 5) {
                            System.out.println("    Motivo -> Aluno não obteve MÉDIA e FREQUÊNCIA suficiente para ser aprovado.");
                        } else {
                            System.out.println("    Motivo -> Aluno não obteve FREQUÊNCIA suficiente para ser aprovado.");
                        }
                    }
                } else {
                    System.out.println("Entrada da frequência inválida!");
                }
            } else {
                System.out.println("Entrada da segunda nota inválida!");
            }
        } else {
            System.out.println("Entrada da primeira nota inválida!");
        }
    }
}