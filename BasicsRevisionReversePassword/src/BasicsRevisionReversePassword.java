import java.util.Scanner;

public class BasicsRevisionReversePassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";


        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        boolean loggedIn = false;
        for (int i = 0; i < 4; i++) {
            String attempt = scanner.nextLine();

            if (attempt.equals(password)) {
                loggedIn = true;
                System.out.printf("User %s logged in.", username);
                break;
            }
            if (i < 3) {
                System.out.println("Incorrect password. Try again.");

            }
        }
        if (!loggedIn) {
            System.out.printf("User %s blocked!", username);
        }
    }
}
