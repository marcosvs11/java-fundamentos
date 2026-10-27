import java.util.ArrayList;

public class CidadesArrayList {
    public static void main (String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("Cuiabá");
        cidades.add("Rondonópolis");
        cidades.add("Rio de Janeiro");
        System.out.println("Lista original: " + cidades);
        System.out.println("2° cidade: " + cidades.get(1));
        cidades.set(1, "Campo Grande");
        System.out.println("Lista índice 1 modificado: " + cidades);
        cidades.remove(0);
        System.out.println("Lista índice 0 removido: " + cidades);
        System.out.println("Lista final: " + cidades);
        System.out.println("Tamanho da lista: " + cidades.size() + " cidades");

    }
}
