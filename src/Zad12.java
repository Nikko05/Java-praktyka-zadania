import java.util.Scanner;

public class Zad12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double travelDistance;
        System.out.println("Liczba przejachanych kilometrów: ");
        travelDistance = keyboard.nextDouble();
        
        double amountOfFuel;
        System.out.println("Ilość zużytrgo paliwa (l): ");
        amountOfFuel = keyboard.nextDouble();

        double amountDistanceOfOneLitre = travelDistance/amountOfFuel;

        System.out.println("Ilość przejechanych kilometrów na jednym litrze: "
                + amountDistanceOfOneLitre
                + "km/l");
    }
}
