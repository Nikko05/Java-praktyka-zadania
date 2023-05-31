public class Zad22 {
    public static void main(String[] args) {
        final int boughtActions = 1000;
        final double priceOfBoughtAction = 32.87;
        final double commissionBought = boughtActions * priceOfBoughtAction * 0.02;

        final int soldActions = 1000;
        final double priceOfSoldAction = 33.92;
        final double commissionSold = soldActions * priceOfSoldAction * 0.02;

        System.out.println("Jacek za akcje zapłacił: " + boughtActions * priceOfBoughtAction);
        System.out.println("Jacek za prowizje przy zakupie zapłacił: " + commissionBought);

        System.out.println("Jacek ze sprzedaży akcji otrzymał: " + soldActions * priceOfSoldAction);
        System.out.println("Jacek za prowizję przy sprzedaży zapłacił: " + commissionSold);

        System.out.println("Jacek na sprzedaży akcji zarobił: "
                + (
                        soldActions * priceOfSoldAction - boughtActions * priceOfBoughtAction
                        - commissionBought - commissionSold
                )
        );
    }
}
