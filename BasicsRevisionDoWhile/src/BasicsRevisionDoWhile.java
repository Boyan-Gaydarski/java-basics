import java.util.Scanner;

public class BasicsRevisionDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());


        do {
            System.out.printf("%d X %d = %d%n", n, multiplier, n * multiplier);
            multiplier++;
        } while (multiplier <= 10);
    }

}
