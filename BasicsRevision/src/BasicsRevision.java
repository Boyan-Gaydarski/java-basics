import java.util.Scanner;

public class BasicsRevision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int oddNum = 2 * i - 1;
            sum += oddNum;
            System.out.println(oddNum);

        }
        System.out.printf("Sum: %d", sum);
    }
}
