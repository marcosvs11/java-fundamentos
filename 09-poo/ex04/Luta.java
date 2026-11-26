package ex04;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Luta {
    Random sorteio = new Random();
    Scanner teclado = new Scanner(System.in);

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta() {

    }

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        setDesafiado(desafiado);
        setDesafiante(desafiante);

        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiado != desafiante) {
            System.out.print("Digite a quantidade de rounds: ");
            int qtdRounds = teclado.nextInt();
            if (qtdRounds <= 0 || qtdRounds > 12) {
                System.out.println("Erro, número de rounds inválido.");
                setAprovada(false);
            } else {
                setRounds(qtdRounds);
                setAprovada(true);
            }
        } else {
            setAprovada(false);
            System.out.println("Erro, não é possível realizar uma luta com esses oponentes.");
        }
    }

    public void Lutar() {
        if (aprovada) {
            int i = 0;
            int pontoDesafiado = 0;
            int pontoDesafiante = 0;
            int diferenca = 0;
            boolean resultadoConfirmado;

            do {
                i++;
                resultadoConfirmado = false;
                int opcao = sorteio.nextInt(3);
                System.out.println("    =====ROUND " + i + "======");
                System.out.print("Resultado: ");
                if (opcao == 1) {
                    System.out.println(" Lutador Vencedor -> " + getDesafiado().getNome() + " (Desafiado)");
                    pontoDesafiado++;
                } else if (opcao == 2) {
                    System.out.println("Lutador Vencedor -> " + getDesafiante().getNome() + " (Desafiante)");
                    pontoDesafiante++;
                } else {
                    System.out.println("Empate técnico");
                }

                System.out.println();
                diferenca = pontoDesafiado - pontoDesafiante;
                if (diferenca < 0) {
                    if (abs(diferenca) > (getRounds() - i) ) {
                        System.out.println(">>> O desafiante " + getDesafiante().getNome() + " garantiu a vitória matemáticamente: ");
                        System.out.println(">>> Desafiante " + pontoDesafiante + " vs. Desafiado " + pontoDesafiado);
                        resultadoConfirmado = true;
                    }
                } else if (diferenca > 0) {
                    if (diferenca > (getRounds() - i) ) {
                        System.out.println(">>> O desafiado " + getDesafiado().getNome() + " garantiu a vitória matemáticamente: ");
                        System.out.println(">>> Desafiado " + pontoDesafiado + " vs. Desafiante " + pontoDesafiante);
                        resultadoConfirmado = true;
                    }
                } else {
                    if (i == getRounds()) {
                        System.out.println(">>> Empate técnico");
                        System.out.println(">>> Desafiante " + pontoDesafiante + " vs. Desafiado " + pontoDesafiado);
                        resultadoConfirmado = true;
                    }
                }
            } while (!resultadoConfirmado);
            if (pontoDesafiado > pontoDesafiante) {
                getDesafiado().ganharLuta();
                getDesafiante().perderLuta();
            } else if (pontoDesafiante > pontoDesafiado) {
                getDesafiante().ganharLuta();
                getDesafiado().perderLuta();
            } else {
                getDesafiado().empatarLuta();
                getDesafiante().empatarLuta();
            }
        } else {
            System.out.println("Erro, sua luta não foi encaminhada para aprovação.");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
