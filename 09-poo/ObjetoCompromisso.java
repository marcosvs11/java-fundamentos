public class ObjetoCompromisso {
    public static void main(String[] args) {
        Compromisso dentista = new Compromisso();
        dentista.local = "Dentista";
        dentista.objetivo = "Limpeza dentária";
        dentista.horario = 17.30f;
        dentista.dia = 17;
        dentista.mes = "Outubro";
        dentista.ano = 2026;
        dentista.recorrencia = "Anualmente";
        dentista.status();
        dentista.cancelar();
        dentista.status();
        dentista.remarcar();
        dentista.status();
        System.out.println();
        Compromisso demartologista = new Compromisso();
        demartologista.local = "Consultório dermatológico";
        demartologista.objetivo = "Acompanhamento das machas acnes ";
        demartologista.horario = 8.15f;
        demartologista.dia = 22;
        demartologista.mes = "Novembro";
        demartologista.ano = 2026;
        demartologista.recorrencia = "Mensalemente";
        demartologista.status();
    }
}
