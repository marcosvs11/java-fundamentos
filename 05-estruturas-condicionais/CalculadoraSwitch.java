import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        double primeiroValor = teclado.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double segundoValor = teclado.nextDouble();
        System.out.println();
        System.out.println("=======OPERAÇÕES========");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite a sua opção: ");
        int opcao = teclado.nextInt();
        double resultado = 0;
        String operacao = "";

        switch (opcao) {
            case 1:
                resultado = primeiroValor + segundoValor;
                operacao = primeiroValor + " + " + segundoValor + " = " + resultado;
                break;
            case 2:
                resultado = primeiroValor - segundoValor;
                operacao = primeiroValor + " - " + segundoValor + " = " + resultado;
                break;
            case 3:
                resultado = primeiroValor * segundoValor;
                operacao = primeiroValor + " x " + segundoValor + " = " + resultado;
                break;
            case 4:
                if (segundoValor == 0) {
                    operacao = "Erro detectado! Não foi possível dividir por zero!";
                } else {
                    resultado = primeiroValor / segundoValor;
                    operacao = primeiroValor + " / " + segundoValor + " = " + resultado;
                }
                break;
            default:
                operacao = "Entrada inválida, digite uma opção disponível!\n";
        }
        System.out.println("Resultado: " + operacao);
    }
}