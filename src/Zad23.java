import java.util.Scanner;
import static java.lang.Math.*;

public class Zad23 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double lengthRow;
        double necessaryDistance;
        double distanceBetweenPlants;
        System.out.println("Podaj długość rzędu: ");
        lengthRow = keyboard.nextDouble();

        System.out.println("Podaj potrzebne miejsce na okratowanie: ");
        necessaryDistance = keyboard.nextDouble();

        System.out.println("Podaj odległość mjiędzy sadzonkami: ");
        distanceBetweenPlants = keyboard.nextDouble();

        double amountOfPlantsInRow = (lengthRow - 2 * necessaryDistance) / distanceBetweenPlants;

        System.out.println("W rzędzi zmieści się " + Math.floor(amountOfPlantsInRow) + " sadzonek.");

    }
}