import java.util.*;

public class SimplePasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("Weak Password - Less than 8 characters");
            return;
        }

        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if ("@#$%^&*()_+-=!<>?/".indexOf(ch) != -1) hasSpecial = true;
        }

        if (hasUpper && hasDigit && hasSpecial) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
            System.out.println("Password must include:");
            if (!hasUpper) System.out.println("- At least one uppercase letter");
            if (!hasDigit) System.out.println("- At least one digit");
            if (!hasSpecial) System.out.println("- At least one special character (e.g. @#$%)");
        }
    }
}
