import java.util.Scanner;

public class BasicsRevisionHoursMinutes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int min = minutes + 30;

        if (min > 59) {
            hours = hours + 1;
            min = (min % 60);
            if (hours > 23) {
                hours = 0;
            }
        }
        System.out.printf("%d:%02d", hours, min);
    }
}
