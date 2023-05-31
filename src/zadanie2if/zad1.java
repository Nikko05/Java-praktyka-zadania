package zadanie2if;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Podaj liczbę z zakresu od 1 do 3999: ");
        String numberString = keyboard.nextLine();
        int number = Integer.parseInt((numberString));

        if (number < 1 || number > 3999) {
            System.out.println("Błędna wartość. Podana liczba musi należeć do przedziału od 1 do 3999.");
        } else {
            int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

            StringBuilder romanNumeral = new StringBuilder();

            for (int i = 0; i < arabicValues.length; i++) {
                while (number >= arabicValues[i]) {
                    romanNumeral.append(romanSymbols[i]);
                    number -= arabicValues[i];
                }
            }

            System.out.println("Odpowiednik rzymski dla liczby " + number + " to: " + romanNumeral);
        }
    }
}