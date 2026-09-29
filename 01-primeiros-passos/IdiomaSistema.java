import java.util.Locale;

public class IdiomaSistema {
    static void main(String[] args) {
        Locale idioma = Locale.getDefault(); // Configuração de idioma do sistema operacional.
        System.out.println("Idioma do sistema: " + idioma.getDisplayLanguage()); // Retorna o idioma do sistema operacional.
    }
}