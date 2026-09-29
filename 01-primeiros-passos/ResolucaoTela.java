import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {
    static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // Acesso a recursos gráficos do sistema operacional.
        Dimension linkTela = toolkit.getScreenSize(); // Obtenção da resolução da tela.

        int altura = linkTela.height; // Obtenção da altura da tela.
        int largura = linkTela.width; // Obtenção da largura da tela.

        System.out.println("Resolução da tela: " + largura + " x " + altura);

    }
}