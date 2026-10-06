public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println("    NUMEROS ALEATÓRIOS");
        double aleatorio = Math.random();
        System.out.println("Entre 0.0 e 1.0: " + aleatorio);
        double limiteDez = 1 + aleatorio * (10 - 1);
        System.out.println("Entre 1.0 e 10.0: " + limiteDez);
        double limiteCinquenta = 11 + aleatorio * (50 - 11);
        System.out.println("Entre 11.0 e 50.0: " + limiteCinquenta);
    }
}