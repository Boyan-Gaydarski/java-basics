import java.util.Scanner;

public class BasicsExamPreparationCruiseShip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cruiseType = scanner.nextLine();
        String cabinType = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (cruiseType) {
            case "Mediterranean" :
                if ("standard cabin".equals(cabinType)) {
                    price = 27.50;
                } else if ("cabin with balcony".equals(cabinType)) {
                    price = 30.20;
                } else {
                    price = 40.50;
                }
                break;
            case "Adriatic" :
                if ("standard cabin".equals(cabinType)) {
                    price = 22.99;
                } else if ("cabin with balcony".equals(cabinType)) {
                    price = 25.00;
                } else {
                    price = 34.99;
                }
                break;
            case "Aegean" :
                if ("standard cabin".equals(cabinType)) {
                    price = 23.00;
                } else if ("cabin with balcony".equals(cabinType)) {
                    price = 26.60;
                } else {
                    price = 39.80;
                }
                break;
        }
        double totalPrice = price * 4 * nights;
        if (nights > 7) {
            totalPrice = totalPrice * 0.75;
        }
        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruiseType, totalPrice);
    }
}
