public class PrevendoResultado {
    public static void main(String[] args) {
        boolean relacao = (8 > 3) && (4 == 4); // true
        System.out.println(relacao + " -> (8 > 3) E (4 == 4)");
        relacao = (8 < 3) || (2 != 2); // false
        System.out.println(relacao + " -> (8 < 3) OU (2 != 2)");
        relacao = (5 >= 5) ^ (3 < 1); // true
        System.out.println(relacao + " -> (5 >= 5) OU (exclusivo) (3 < 1)");
        relacao = !(7 == 7); // false
        System.out.println(relacao + " -> NÃO(7 == 7)");
        relacao = (4 != 4) || (10 >= 10); // true
        System.out.println(relacao + " -> (4 != 4) OU (10 >= 10)");
    }
}


