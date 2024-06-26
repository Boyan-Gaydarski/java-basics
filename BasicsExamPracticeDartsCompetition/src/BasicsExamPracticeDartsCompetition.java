import java.util.Scanner;

public class BasicsExamPracticeDartsCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingPoints = Integer.parseInt(scanner.nextLine());
        int moves = 0;

        while (startingPoints > 0) {
            String sector = scanner.nextLine();
            if (sector.equals("bullseye")) {
                moves++;
                System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", moves);
                break;
            }

            int points = Integer.parseInt(scanner.nextLine());

            switch (sector) {
                case "number section" :
                    moves++;
                    break;
                case "double ring" :
                    moves++;
                    points = points * 2;
                    break;
                case "triple ring" :
                    moves++;
                    points = points * 3;
                    break;
            }
            startingPoints = startingPoints - points;

            if (startingPoints == 0) {
                System.out.printf("Congratulations! You won the game in %d moves!", moves);
                break;
            } else if (startingPoints < 0) {
                System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(startingPoints));
                break;
            }
        }
    }
}
