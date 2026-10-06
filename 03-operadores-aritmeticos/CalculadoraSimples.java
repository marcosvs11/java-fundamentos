import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite o 1° número: ");
        double num1 = teclado.nextDouble();
        System.out.print("Digite o 2° número: ");
        double num2 = teclado.nextDouble();
        double resultado = num1 + num2;
        System.out.println("SOMA: " + num1 + " + " + num2 + " = " + resultado);
        resultado = num1 - num2;
        System.out.println("SUBTRAÇÃO: " + num1 + " - " + num2 + " = " + resultado);
        resultado = num1 * num2;
        System.out.println("MULTIPLICAÇÃO: " + num1 + " x " + num2 + " = " + resultado);
        resultado = Math.pow(num1, num2);
        System.out.println("POTENCIALIZAÇÃO: " + num1 + " elevado a " + num2 + " = " + resultado);
        resultado = Math.sqrt(num1);
        System.out.println("RAIZ QUADRADA DE: " + num1 + " = " + resultado);
        resultado = Math.cbrt(num1);
        System.out.printf("RAIZ CÚBICA DE: " + num1 + " = " + resultado);
    }
}