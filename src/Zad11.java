import java.util.Scanner;

public class Zad11 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double productValue;

        System.out.println("Podaj wartość produktu:");
        productValue = keyboard.nextDouble();

        double stateTax = productValue * 0.04;
        double localTax = productValue * 0.02;
        double amountSales = productValue + stateTax + localTax;

        System.out.println("Warość kupowanego produktu: "
                + productValue
                + ", podatek stanowy: "
                + stateTax
                + ", lokalny podatek: "
                + localTax
                + ", łączna suma sprzedaży: "
                + amountSales);
    }
}
