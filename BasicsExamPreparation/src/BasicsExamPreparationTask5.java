import java.util.Scanner;

public class BasicsExamPreparationTask5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kgFood = Integer.parseInt(scanner.nextLine());

        int grFood = kgFood * 1000;


        String untilAdoption = scanner.nextLine();

        while (!untilAdoption.equals("Adopted")) {


            grFood = grFood - Integer.parseInt(untilAdoption);


            untilAdoption = scanner.nextLine();
        }

        if (grFood < 0) {
            System.out.printf("Food is not enough. You need %d grams more.", Math.abs(grFood));
        } else {
            System.out.printf("Food is enough! Leftovers : %d grams.", grFood);
        }

    }
}
