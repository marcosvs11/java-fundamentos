import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Compromisso {
    public String local;
    public String objetivo;
    public float horario;
    public int dia;
    private String mes;
    private int ano;
    public String recorrencia;
    private boolean cancelado = false;

    // todo getter e setter são públicos
    public Compromisso(String local, String objetivo, float horario, int dia, String recorrencia){ // este é método construtor
        Locale ptBr = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
        DateTimeFormatter formatadorMes = DateTimeFormatter.ofPattern("MMMM", ptBr);
        LocalDate hoje = LocalDate.now();
        String mesExtenso = hoje.format(formatadorMes);
        this.setLocal(local);
        this.setObjetivo(objetivo);
        this.setHorario(horario);
        this.setDia(dia);
        this.setRecorrencia(recorrencia);
        this.ano = hoje.getYear();
        this.mes = mesExtenso;

    }

    public String getLocal(){
        return this.local;
    }
    public void setLocal(String local){
        this.local = local;
    }

    public String getObjetivo(){
        return this.objetivo;
    }
    public void setObjetivo(String objetivo){
        this.objetivo = objetivo;
    }

    public float getHorario(){
        return this.horario;
    }
    public void setHorario(float horario){
        this.horario = horario;
    }

    public int getDia(){
        return this.dia;
    }
    public void setDia(int dia){
        this.dia = dia;
    }

    public String getMes(){
        return this.mes;
    }
    public void setMes(String mes){
        this.mes = mes;
    }

    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String getRecorrencia(){
        return this.recorrencia;
    }
    public void setRecorrencia(String recorrencia){
        this.recorrencia = recorrencia;
    }

    public boolean getCancelado(){
        return this.cancelado;
    }
    public void setCancelado(boolean cancelado){
        this.cancelado = cancelado;
    }

    public void status() {
        String horarioTexto = Float.toString(this.getHorario());
        String horarioFormatado = horarioTexto.replace(".", "h");
        if (!this.cancelado) {
            System.out.printf("*Você tem um compromisso no(a) %s: \n", this.getLocal());
            System.out.printf("     -> Objetivo: %s!\n", this.getObjetivo());
            System.out.printf("     -> Data: Dia %s, as %sm, no mês de %s de %s!\n", this.getDia(), horarioFormatado, this.getMes(), this.getAno());
            System.out.println("    OBS: Compromisso de recorrência " + this.getRecorrencia());
        } else {
            System.out.println();
            System.out.println("*Atenção, compromisso no(a) " + this.getLocal() + " CANCELADO!");
            System.out.println();
        }
    }
    private void cancelar() {
        this.cancelado = true;
    }

    public void remarcar() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("*Remarcando o compromisso " + this.getLocal() + "... ");
        System.out.print("Dia: ");
        this.setDia(teclado.nextInt());
        System.out.print("Horario: ");
        this.setHorario(teclado.nextFloat());
        this.cancelado = false;
        System.out.println("*Compromisso remarcado!");
        this.status();
    }
}
