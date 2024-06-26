import java.util.Scanner;

public class BasicsRevisionWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int multiplier = 1;

        while (multiplier <= 10) {
            System.out.printf("%d X %d = %d%n", n, multiplier, n * multiplier);
            multiplier++;
        }
    }
}
