import java.util.Scanner;

public class Zad16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String cityName;

        System.out.println("Podaj nazwę miasta: ");
        cityName = keyboard.nextLine();
        int amountOflettersInCityName = cityName.length();
        String toUperCityName = cityName.toUpperCase();
        String toLowerCityName = cityName.toLowerCase();
        char firstCharOfCityName = cityName.charAt(0);

        System.out.println("Miasto "
                + cityName
                + " posiada w nazwie "
                + amountOflettersInCityName
                + " liter, "
                + toUperCityName
                + ", "
                + toLowerCityName
                + ", pierwszy znak to: "
                + firstCharOfCityName);
    }
}
