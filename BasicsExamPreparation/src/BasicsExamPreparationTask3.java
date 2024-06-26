import java.util.Scanner;

public class BasicsExamPreparationTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String colour = scanner.nextLine();
        int numberOfEggs = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (size) {
            case "Large":
                switch (colour) {

                    case "Red":
                        price = 16.0;
                        break;
                    case "Green":
                        price = 12.0;
                        break;
                    case "Yellow":
                        price = 9.0;
                        break;
                }
                break;
            case "Medium":
                switch (colour) {

                    case "Red":
                        price = 13.0;
                        break;
                    case "Green":
                        price = 9.0;
                        break;
                    case "Yellow":
                        price = 7.0;
                        break;
                }

                break;
            case "Small":
                switch (colour) {

                    case "Red":
                        price = 9.0;
                        break;
                    case "Green":
                        price = 8.0;
                        break;
                    case "Yellow":
                        price = 5.0;
                        break;
                }

                break;
        }
        double income = price * numberOfEggs * 0.65;

        System.out.printf("%.2f leva.", income);
    }

}

