package zadanie2if;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ile imion chcesz posortować: ");
        String amountOfNamesString = keyboard.nextLine();

        int amountOfNamesNumber = 0;
        try {
            amountOfNamesNumber = Integer.parseInt(amountOfNamesString);
            if (amountOfNamesNumber < 0) amountOfNamesNumber = -amountOfNamesNumber;
        } catch (NumberFormatException e) {
            System.out.println("Podaj liczbę naturalną.");

        }

        String[] names = new String[amountOfNamesNumber];
    }
}
