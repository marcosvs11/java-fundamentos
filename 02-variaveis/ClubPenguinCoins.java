import java.util.Scanner;

public class ClubPenguinCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the total number of coins in Club Penguin: ");
        double moedaPeguin = scanner.nextFloat();
        double totalUSD = (moedaPeguin * 0.0045);
        System.out.printf("Total USD: %.2f", totalUSD);
    }
}
