import java.util.Scanner;

public class VerificadorCodigoAcesso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean codigoValid = false;
        String codigoInformado = scanner.nextLine();
        String codigoEsperado = scanner.nextLine();
        if (codigoInformado.equals(codigoEsperado)) {
            codigoValid = true;
        } else {
            codigoValid = false;
        }

        System.out.println (codigoValid ? "ACESSO LIBERADO" : "ACESSO NEGADO");

        scanner.close();
    }
}
