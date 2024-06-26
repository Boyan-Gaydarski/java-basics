import java.util.Scanner;

public class BasicsExamPracticeBakingCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfBakers = Integer.parseInt(scanner.nextLine());

        double totalMoney = 0.0;
        double price = 0.0;
        int totalBaked = 0;

        for (int i = 1; i <= numOfBakers; i++) {

            String nameOfBaker = scanner.nextLine(); //name of chef

            int numOfCookies = 0;
            int numOfCakes = 0;
            int numOfWaffles = 0;

            String input = scanner.nextLine();  // type or "stop baking!" command

            while (!"Stop baking!".equals(input)) {


                int numBaked = Integer.parseInt(scanner.nextLine()); // number of things baked from a certain type

                switch (input) {
                    case "cookies":
                        price = 1.50;
                        numOfCookies = numBaked;
                        break;
                    case "cakes":
                        price = 7.80;
                        numOfCakes = numBaked;
                        break;
                    case "waffles":
                        price = 2.30;
                        numOfWaffles = numBaked;
                        break;

                }

                totalBaked += numBaked;

                double money = numBaked * price;
                totalMoney += money;


                input = scanner.nextLine();
            }
            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.%n", nameOfBaker, numOfCookies, numOfCakes, numOfWaffles);
        }
        System.out.printf("All bakery sold: %d%n", totalBaked);
        System.out.printf("Total sum for charity: %.2f lv.", totalMoney);
    }
}
