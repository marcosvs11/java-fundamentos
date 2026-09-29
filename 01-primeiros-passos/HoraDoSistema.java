import java.util.Date;

public class HoraDoSistema {
    static void main(String[] args) {
        Date data = new Date(); // Cria um objeto Date.
        System.out.println("Hora do sistema: " + data.toString()); // Retorna a data e hora atual do sistema operacional.
    }
}