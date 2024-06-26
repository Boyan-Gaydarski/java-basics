import java.util.Scanner;

public class BasicsRevisionPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        int tries = 0;
        boolean loggedIn = false;

        StringBuilder passwordBuilder = new StringBuilder();

        for (int position = username.length() - 1; position >= 0; position--) {
            char symbol = username.charAt(position);
            passwordBuilder.append(symbol);
        }
        String password = passwordBuilder.toString();

        while (tries < 4) {

            String passwordAttempt = scanner.nextLine();
            tries++;

            if (passwordAttempt.equals(password)) {
                System.out.printf("User %s logged in.", username);
                loggedIn = true;
                break;
            }
            if (tries != 4) {
                System.out.println("Incorrect password. Try again.");
            }
        }
        if (!loggedIn) {
            System.out.printf("User %s blocked!", username);
        }
    }
}
