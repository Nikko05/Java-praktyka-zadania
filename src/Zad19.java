public class Zad19 {
    public static void main(String[] args) {
            int numberPeople = 12467;
            double percentageOfBuyingPeople = 14.0;
            double percentageOfPeoplePreferCytrusTaste = 64.0;
            double numberOfBuying = numberPeople * (percentageOfBuyingPeople / 100);
            double numberOfPreferCytrus = numberOfBuying * (percentageOfPeoplePreferCytrusTaste / 100);
            System.out.println("Liczba ankietowanych osób, które kupują przynajmniej jeden napój energetyczny tygodniowo: " + Math.round(numberOfBuying));
            System.out.println("Liczba ankietowanych osób, które preferują napoje energetyczne o smaku cytrusowym: " + Math.round(numberOfPreferCytrus));
    }
}

