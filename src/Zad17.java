import java.util.Scanner;

public class Zad17 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Cena: ");
        double price = keyboard.nextDouble();
        double tax = price * 0.0675;
        double tip = price * 0.2;

        System.out.println(
                "Cena: "
                + price
                + "Podatek: "
                + tax
                + "Napiwek: "
                + tip
                + "Suma: "
                + (price + tax + tip));
    }
}
