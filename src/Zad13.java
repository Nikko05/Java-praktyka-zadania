import java.util.Scanner;

public class Zad13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int numberOfCookies = 40;
        int numberOfPortion = 10;
        int cookiesInOnePortion = numberOfCookies / numberOfPortion;
        int caloriesPerPortion = 300;
        double caloriesPerCookie = caloriesPerPortion / cookiesInOnePortion;

        double numberOfCookiesEaten;
        System.out.println("Podaj liczbę zjedzonych ciasteczek: ");
        numberOfCookiesEaten = keyboard.nextDouble();

        double caloriesOfCookiesEaten = numberOfCookiesEaten * caloriesPerCookie;
        System.out.println("Zjadając "
                + numberOfCookiesEaten
                + " ciasteczek, skonsumowałeś "
                + caloriesOfCookiesEaten
                + " kcal");
    }
}
