package ex04;
import java.util.ArrayList;

public class InscreverLutador {
    public static void main(String[] args) {
        ArrayList<UltraEmojiCombat> lutadores = new ArrayList<>();
        lutadores.add(new UltraEmojiCombat(
            "Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1
        ));
        lutadores.add(new UltraEmojiCombat(
           "Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3
        ));
        lutadores.add(new UltraEmojiCombat(
           "SnapShadow", "EUA", 35, 1.65, 80.9, 12,2,1
        ));
        lutadores.add(new UltraEmojiCombat(
           "DeadCode", "Austrália", 28, 1.93, 81.6, 13, 0, 2
        ));
        lutadores.add(new UltraEmojiCombat(
            "Ufcobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3
        ));
        lutadores.add(new UltraEmojiCombat(
            "Nerdaad", "EUA", 30, 1.81, 105.7, 12, 2, 4
        ));

        lutadores.get(2).apresentar();
        lutadores.get(5).apresentar();
        lutadores.get(0).apresentar();
        lutadores.get(4).apresentar();
        lutadores.get(1).apresentar();
        lutadores.get(3).apresentar();
    }
}
