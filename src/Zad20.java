import java.util.Scanner;

public class Zad20 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double sugar = 1.5;
        double butter = 1;
        double flour = 2.75;

        int expectedNumberOfCookies;
        System.out.println("Podaj ile ciasteczek chcesz zrobić: ");
        expectedNumberOfCookies = keyboard.nextInt();
        double proportions = expectedNumberOfCookies / 48;

        System.out.println(
                "Do upieczenia "
                + expectedNumberOfCookies
                + " ciasteczek, potrezba: \n"
                + sugar * proportions
                + " szklanki cukru\n"
                + butter * proportions
                + " szklanki masła\n"
                + flour * proportions
                + " szklanki mąki\n"
        );

    }
}