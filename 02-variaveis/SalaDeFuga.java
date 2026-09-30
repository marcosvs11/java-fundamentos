import java.util.Scanner;

public class SalaDeFuga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Clue: I speak without a mouth and hear without ears. I have no body, but I come to life with the wind. What am I?");
        System.out.print("Your response: ");
        String clue = scanner.nextLine();
        System.out.println("The correct answer is: eco");
        System.out.println("His response was: " + clue);
    }
}

