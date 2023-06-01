package zadania4petle;
import java.util.Scanner;

public class zad1 {
    static double sumOfGeometricSequence(double firstWordOfSequence, double spike, double amountOfWord) {
        double sumSequence;
        if(spike == 1) sumSequence = firstWordOfSequence * amountOfWord;
        else sumSequence = firstWordOfSequence * (1 - Math.pow(spike, amountOfWord)) / (1 - spike);
        return sumSequence;
    }

    static double sumOfArithmeticSequence(double firstWordOfSequence, double spike, double amountOfWord) {
        double sumSequence = amountOfWord * (firstWordOfSequence * 2 + (amountOfWord - 1) * spike) / 2;
        return sumSequence;
    }

    static double resultOfAmountsWordInArithmeticSequence(double firstWordOfSequence, double spike, double amountOfWord) {
        double amountsResult = firstWordOfSequence + (amountOfWord  -1) * spike;
        return amountsResult;
    }

    static double resultOfAmountsWordInGeometricSequence(double firstWordOfSequence, double spike, double amountOfWord) {
        double amountsResult = firstWordOfSequence * Math.pow(spike, amountOfWord - 1);
        return amountsResult;
    }

    static double getData(String text) {
        Scanner input = new Scanner(System.in);
        System.out.println(text);
        onlyNumbers();
        double variable = number;
        return variable;
    }
    public static double number;
    static void onlyNumbers() {
        Scanner input = new Scanner(System.in);
        String numberS = input.nextLine();

        try {
            number = Double.parseDouble(numberS);
        } catch (NumberFormatException e) {
            System.out.println("Podaj tylko liczby. Spróbuj jeszcze raz.");
            onlyNumbers();
        }
    }

    public static void main(String[] args) {
        double firstWordOfSequence;
        double spike;
        double amountOfWord;

        System.out.println("Obliczyć ciąg arytmetyczny (1) geometryczny (2)?");
        onlyNumbers();
        double sequence = number;
        // 1 - arithmetic
        // 2 - geometric

        while (sequence != 1 && sequence != 2) {
            System.out.println("Obliczyć ciąg arytmetyczny (1) geometryczny (2)?");
            onlyNumbers();
            sequence = number;
        }

        firstWordOfSequence = getData("Podaj pierwszy wyraz ciągu: ");
        if(sequence == 1) spike = getData("Podaj różnice ciągu: ");
        else spike = getData("Podaj iloraz ciągu: ");
        amountOfWord = getData("Podaj ilość wyrazów w ciągu: ");

        if(sequence == 1) System.out.println(
                "Suma ciągu arytmetycznego jest równa: "
                + sumOfArithmeticSequence(firstWordOfSequence, spike, amountOfWord)
                + "\nWynik n-tego wyrazu ciągu jest równy: "
                + resultOfAmountsWordInArithmeticSequence(firstWordOfSequence, spike, amountOfWord)
        );
        else System.out.println(
                "\nSuma ciągu geometrycznego jest równa: "
                + sumOfGeometricSequence(firstWordOfSequence, spike, amountOfWord)
                + "\nWynik n-tego wyrazu ciągu arytmetycznego jest równe: "
                + resultOfAmountsWordInGeometricSequence(firstWordOfSequence, spike, amountOfWord)
        );
    }
}
