import java.util.Scanner;

public class BasicsExamPreparationTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balls = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int otherBalls = 0;
        int blackBalls = 0;

        for (int i = 1; i <= balls; i++) {
            String ball = scanner.nextLine();

            switch (ball) {
                case "red":
                    points += 5;
                    redBalls++;
                    break;
                case "orange":
                    points += 10;
                    orangeBalls++;
                    break;
                case "yellow":
                    points += 15;
                    yellowBalls++;
                    break;
                case "white":
                    points += 20;
                    whiteBalls++;
                    break;
                case "black":
                    points = points / 2;
                    blackBalls++;
                    break;
                default:
                    otherBalls++;
                    break;

            }

        }
        System.out.println("Total points: " + points);
        System.out.println("Red balls: " + redBalls);
        System.out.println("Orange balls: " + orangeBalls);
        System.out.println("Yellow balls: " + yellowBalls);
        System.out.println("White balls: " + whiteBalls);
        System.out.println("Other colors picked: " + otherBalls);
        System.out.println("Divides from black balls: " + blackBalls);
    }
}
