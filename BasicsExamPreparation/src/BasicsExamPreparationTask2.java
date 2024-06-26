import java.util.Scanner;

public class BasicsExamPreparationTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesQual = Integer.parseInt(scanner.nextLine());
        int secondsQual = Integer.parseInt(scanner.nextLine());
        double schuteLength = Double.parseDouble(scanner.nextLine());
        int secPer100metres = Integer.parseInt(scanner.nextLine());

        double delaysPer100metres = schuteLength / 120;
        double personalTime = (schuteLength / 100 * secPer100metres) - (delaysPer100metres * 2.5);

        double qualTime = 60.0 * minutesQual + secondsQual;

        if (qualTime >= personalTime) {

            System.out.printf("Marin Bangiev won an Olympic quota!%nHis time is %.3f.", personalTime);
        } else {
            System.out.printf("No, Marin failed! He was %.3f seconds slower.", personalTime - qualTime);
        }
    }
}