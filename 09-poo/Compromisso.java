import java.util.Scanner;

public class Compromisso {
    String local;
    String objetivo;
    float horario;
    int dia;
    String mes;
    int ano;
    String recorrencia;
    Boolean cancelado = false;

    void status() {
        String horarioTexto = Float.toString(this.horario);
        String horarioFormatado = horarioTexto.replace(".", "h");
        if (!this.cancelado) {
            System.out.printf("Você tem um compromisso no(a) %s, com o objetivo de %s!\n", this.local, this.objetivo);
            System.out.printf("Está marcado para o dia %s, no mês de %s, no ano %s, as %sm!\n", this.dia, this.mes, this.ano, horarioFormatado);
            System.out.println("Compromisso de recorrência " + this.recorrencia);
        } else {
            System.out.println("Compromisso cancelado!");
        }
    }
    void cancelar() {
        this.cancelado = true;
    }
    void remarcar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Remarcando o compromisso: ");
        System.out.print("Dia: ");
        this.dia = teclado.nextInt();
        System.out.print("Mes: ");
        this.mes = teclado.next();
        System.out.print("Ano: ");
        this.ano = teclado.nextInt();
        System.out.print("Horario: ");
        this.horario = teclado.nextFloat();
        this.cancelado = false;
    }
}
