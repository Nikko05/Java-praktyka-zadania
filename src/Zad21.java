import java.util.Scanner;
import static java.lang.Math.*;

public class Zad21 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double deposit;
        double depositRate;
        int amountOfCapitalize;
        int amountOfYears;
        double finalAmount;

        System.out.println("Podaj kwote depozytu: ");
        deposit = keyboard.nextDouble();

        System.out.println("Podaj roczną stope oprocenowania: ");
        depositRate = keyboard.nextDouble();
        depositRate = depositRate / 100;

        System.out.println("Podaj ile razy w roku odsetki są kapitalizowane: ");
        amountOfCapitalize = keyboard.nextInt();

        System.out.println("Podaj na ile lat zdeponujesz kwotę: ");
        amountOfYears = keyboard.nextInt();

        finalAmount = deposit *  pow(1+depositRate/amountOfCapitalize, amountOfCapitalize*amountOfYears);
        System.out.println("Po "
                + amountOfYears
                + " latach na koncie będzie znajdować się: "
                + Math.round(finalAmount)
        );
    }
}