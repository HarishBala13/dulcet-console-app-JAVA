package comdulcetapplication;

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserManager {
    private HashMap<String, User> userMap = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);

    public boolean start() {
        System.out.println("\n1. Login\n2. Register\n3. Exit");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear newline

        switch (choice) {
            case 1:
                return login();
            case 2:
                register();
                return start();
            case 3:
                return false;
            default:
                System.out.println("Invalid option.");
                return start();
        }
    }

    private void register() {
        String username;
        do {
            System.out.print("Enter username (letters and spaces only, min 2 characters): ");
            username = scanner.nextLine();
        } while (!isValidName(username));

        String email;
        do {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
        } while (!isValidEmail(email));

        char[] password;
        do {
            System.out.print("Enter password (min 8 chars, incl. uppercase, lowercase, digit, special char): ");
            password = PasswordMasker.readPassword();
        } while (!isValidPassword(new String(password))); // Convert char[] to String for validation

        userMap.put(email, new User(username, email, new String(password)));
        System.out.println("\nRegistration successful!");
    }

    private boolean login() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        System.out.print("Enter password: ");
        char[] password = PasswordMasker.readPassword();

        User user = userMap.get(email);

        if (user != null && user.isPasswordCorrect(new String(password))) {
            return true;
        } else {
            System.out.println("Invalid email or password.");
            return false;
        }
    }

    private boolean isValidName(String name) {
        return Pattern.matches("[A-Za-z ]{2,}", name);
    }

    private boolean isValidEmail(String email) {
        return Pattern.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$", email);
    }

    private boolean isValidPassword(String password) {
        return Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", password);
    }
}
