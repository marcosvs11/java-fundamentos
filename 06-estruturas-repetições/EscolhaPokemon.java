import java.util.Scanner;

public class EscolhaPokemon {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        String resposta = "s";
        while (resposta.equals("s")) {
            System.out.println("======================");
            System.out.println("   Pokemon FireRed");
            System.out.println("======================");
            System.out.println("1 - Pikachu");
            System.out.println("2 - Lucário");
            System.out.println("3 - Charizard");
            System.out.print("Escolha a sua opção: ");
            int opcao = teclado.nextInt();
            System.out.println("=====Batalha Final=====");
            String adversario = "Garchomp";
            if (opcao == 1) {
                String pokemon = "Pikachu";
                System.out.println(pokemon + " vs " + adversario);
                System.out.println("1 - Thunder Shock");
                System.out.println("2 - Quick Attack");
                System.out.println("3 - Iron Tail");
                System.out.print("Escolha seu ataque: ");
                int ataque = teclado.nextInt();
                if (ataque == 1) {
                    System.out.println("Você escolheu Thunder Shock!");
                    System.out.println("Ataque com eficiência baixíssima...");
                    System.out.println("-------------------------------------");
                    System.out.println("Garchomp usou Earthquake!");
                    System.out.println("Ataque super eficiente! PIKACHU DERROTADO...");
                    System.out.println("GAME OVER...");
                } else if (ataque == 2) {
                    System.out.println("Você escolheu Quick Attack!");
                    System.out.println("Ataque com eficiência baixa...");
                    System.out.println("-------------------------------------");
                    System.out.println("Garchomp usou Earthquake!");
                    System.out.println("Ataque super eficiente! PIKACHU DERROTADO...");
                    System.out.println("GAME OVER...");
                } else if(ataque == 3) {
                    System.out.println("Você escolheu Iron Tail!");
                    System.out.println("Ataque com eficiência média...");
                    System.out.println("-------------------------------------");
                    System.out.println("Garchomp usou Earthquake!");
                    System.out.println("Ataque super eficiente! PIKACHU DERROTADO...");
                    System.out.println("GAME OVER...");
                } else {
                    System.out.println("Erro, opção inválida!");
                }
            } else if (opcao == 2) {
                String pokemon = "Lucário";
                System.out.println(pokemon + " vs " + adversario);
                System.out.println("1 - Ice Punch");
                System.out.println("2 - Aura Sphere");
                System.out.println("3 - Extreme Speed");
                System.out.print("Escolha seu ataque: ");
                int ataque = teclado.nextInt();
                if (ataque == 1) {
                    System.out.println("Você escolheu Ice Punch!");
                    System.out.println("Ataque com eficiência altíssima...");
                    System.out.println("Garchomp foi derrotado...LUCÁRIO VENCEDOR!");
                } else if (ataque == 2) {
                    System.out.println("Você escolheu Aura Sphere!");
                    System.out.println("Ataque com eficiência média...");
                    System.out.println("-------------------------------------");
                    System.out.println("Garchomp usou Earth Power!");
                    System.out.println("Ataque super eficiente! LUCÁRIO DERROTADO...");
                    System.out.println("GAME OVER...");
                } else if(ataque == 3) {
                    System.out.println("Você escolheu Extreme Speed!");
                    System.out.println("Ataque com eficiência baixa...");
                    System.out.println("-------------------------------------");
                    System.out.println("Garchomp usou Earth Power!");
                    System.out.println("Ataque super eficiente! LUCÁRIO DERROTADO...");
                    System.out.println("GAME OVER...");
                } else {
                    System.out.println("Erro, opção inválida!");
                }
            } else if (opcao == 3) {
                String pokemon = "Charizard";
                System.out.println(pokemon + " vs " + adversario);
                System.out.println("1 - Dragon Pulse");
                System.out.println("2 - Air Slash");
                System.out.println("3 - Flamethrower");
                System.out.print("Escolha seu ataque: ");
                int ataque = teclado.nextInt();
                if (ataque == 1) {
                    System.out.println("Você escolheu Dragon Pulse!");
                    System.out.println("Ataque com eficiência altíssima...");
                    System.out.println("Garchomp foi derrotado...CHARIZARD VENCEDOR!");
                } else if (ataque == 2) {
                    System.out.println("Você escolheu Air Slash!");
                    System.out.println("Ataque com eficiência alta...");
                    System.out.println("Garchomp está cambaleando...");
                    System.out.println("Garchomp não consegue lutar...CHARIZARD VENCEDOR!");
                } else if(ataque == 3) {
                    System.out.println("Você escolheu Flamethrower!");
                    System.out.println("Ataque com eficiência média...");
                    System.out.println("-------------------------------------");
                    System.out.println("Garchomp usou Earth Power!");
                    System.out.println("Ataque super eficiente! CHARIZARD DERROTADO...");
                    System.out.println("GAME OVER...");
                } else {
                    System.out.println("Erro, opção inválida!");
                }
            } else {
                System.out.println("Erro, opção inválida!");
            }
            System.out.print("Quer tentar novamente? [s/n]: ");
            resposta = teclado.next();
        }
        System.out.println("Desligando...");
    }
}