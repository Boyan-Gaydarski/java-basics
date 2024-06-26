import java.util.Scanner;

public class BasicsExamPreparationTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfSeries = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double minsStandardEpisode = Double.parseDouble(scanner.nextLine());

        int allEpisodes = seasons * episodes;

        double allMins = ((minsStandardEpisode * 1.2 * allEpisodes) + (seasons * 10));

        double accMins = Math.floor(allMins);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", nameOfSeries, accMins);





    }
}
