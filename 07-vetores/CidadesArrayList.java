import java.util.ArrayList;
import java.util.Scanner;

public class CidadeArrayList {
    public static void main (String[] args) {
        var teclado = new Scanner(System.in);
        ArrayList<String> cidades = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Digite uma cidade: ");
            cidades.add(teclado.next());
        }
        System.out.println(cidades);
    }
}
