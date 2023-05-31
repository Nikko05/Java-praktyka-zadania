public class Zad18 {
    public static void main(String[] args) {
        double priceOfAction = 600 * 21.77;
        double commission = 600 * 0.02;
        double suma = priceOfAction + commission;

        System.out.println("Cena za akcje: "
                + priceOfAction
                + "Prowizja: "
                + commission
                + "Suma: "
                + suma);
    }
}