public class ObjetoCompromisso {
    public static void main(String[] args) {
        Compromisso dentista = new Compromisso("Dentista", "Limpeza dentária", 17.35f, 11, "Mensalmente");
        dentista.status();
        Compromisso futsal = new Compromisso("Quadra da UFR", "Treino de futsal", 19, 12, "Semanalmente");
        futsal.status();
        // futsal.cancelar();
        futsal.setCancelado(true);
        futsal.status();
        futsal.remarcar();
    }
}
