import java.util.Scanner;

public class BasicsRevisionPadawan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyAmount = Double.parseDouble(scanner.nextLine());
        int studentCount = Integer.parseInt(scanner.nextLine());
        double lightsaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightsabersNeeded = Math.ceil(studentCount * 1.1);
        int lightsabersNeededAsInt = (int) lightsabersNeeded;

        double lightsabersTotalPrice = lightsabersNeededAsInt * lightsaberPrice;
        double robesTotalPrice = studentCount * robePrice;

        int freeBelts = studentCount / 6;
        int beltsNeeded = studentCount - freeBelts;
        double beltsTotalPrice = beltsNeeded * beltPrice;

        double moneyNeeded = beltsTotalPrice + robesTotalPrice + lightsabersTotalPrice;

        if (moneyAmount < moneyNeeded) {
            System.out.printf("Ivan Cho will need %.2flv more.", moneyNeeded - moneyAmount);
        } else {
            System.out.printf("The money is enough - it would cost %.2flv.", moneyNeeded);
        }
    }
}

