import java.util.Scanner;

public class BasicsRevisionFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String numberAsString = scanner.nextLine();

        int factorialSum = 0;

        for (int i = 0; i < numberAsString.length(); i++) {

            int digit = Integer.parseInt("" + numberAsString.charAt(i));

            int factorial = 1;
            for (int j = 1; j <= digit ; j++) {
                factorial *= j;
            }

            factorialSum += factorial;
        }

        int number = Integer.parseInt(numberAsString);

        if (number == factorialSum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
