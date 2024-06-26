import java.util.Scanner;

public class BasicsExamPreparationTask6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfLoaves = Integer.parseInt(scanner.nextLine());

        String bestBaker = "";
        int bestScore = Integer.MIN_VALUE;

        for (int i = 1; i <= numberOfLoaves; i++) {

            int currentScore = 0;

            String bakerName = scanner.nextLine();

            String command = scanner.nextLine();

            while (!command.equals("Stop")) {
                currentScore = currentScore + Integer.parseInt(command);


                command = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", bakerName, currentScore);
            if (currentScore >= bestScore) {
                bestScore = currentScore;
                System.out.printf("%s in the new number 1!%n",bakerName);
                bestBaker = bakerName;
            }
        }
        System.out.printf("%s won the competition with %d points!%n",bestBaker, bestScore);
    }
}