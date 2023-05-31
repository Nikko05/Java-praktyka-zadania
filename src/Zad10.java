import java.util.Scanner;

public class Zad10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String firstName;
        String middleName;
        String lastName;

        System.out.println("Podaj pierwsze imie:");
        firstName = keyboard.nextLine();

        System.out.println("Podaj drugie imie:");
        middleName = keyboard.nextLine();

        System.out.println("Podaj nazwisko:");
        lastName = keyboard.nextLine();

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.println(firstInitial + " " + middleInitial + " " + lastInitial);
    }
}
