import java.util.Scanner;

public class BasicsExamPracticeQuizGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int gamesCount = Integer.parseInt(scanner.nextLine());

        double totalScore = 0.0;
        boolean flag = false;

        for (int i = 1; i <= gamesCount; i++) {

            String game = scanner.nextLine();
            double score = Double.parseDouble(scanner.nextLine());

            int volleyball = 0;
            int tennis = 0;
            int badminton = 0;
            double avgVolleyballScore = 0.0;
            double avgTennisScore = 0.0;
            double avgBadmintonScore = 0.0;

            switch (game) {
                case "volleyball":
                    score = score * 1.07;
                    avgVolleyballScore += score;
                    volleyball++;
                    break;
                case "tennis":
                    score = score * 1.05;
                    avgTennisScore += score;
                    tennis++;
                    break;
                case "badminton":
                    score = score * 1.02;
                    avgBadmintonScore += score;
                    badminton++;
                    break;
            }

            if (Math.floor(avgVolleyballScore / volleyball) < 75) {
                flag = true;
            } else if (Math.floor(avgTennisScore / tennis) < 75) {
                flag = true;
            } else if (Math.floor(avgBadmintonScore / badminton) < 75) {
                flag = true;
            }

            totalScore += score;

        }

        if (!flag) {
            System.out.printf("Congratulations, %s! You won the cruise games with %.0f points.", name, Math.floor(totalScore));
        } else {
            System.out.printf("Sorry, %s, you lost. Your points are only %.0f", name, Math.floor(totalScore));
        }

    }
}
