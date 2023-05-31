import java.util.Scanner;

public class Zad15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double detailPriceCD;
        System.out.println("Podaj detaliczną cenę płytki: ");
        detailPriceCD = keyboard.nextDouble();

        double margin = 0.4;
        double profit = detailPriceCD * margin;

        System.out.println("Zysk ze sprzedaży płytki wynosi: " + profit);
    }
}
