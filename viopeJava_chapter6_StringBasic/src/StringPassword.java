/**
 * Created by Minh Hoang on 13/07/2017.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter user name: ");
        String userNameEntered = input.nextLine();

        System.out.println("Enter password: ");
        String passwordEntered = input.nextLine();

        validatePassword(userNameEntered, passwordEntered);
    }

    private static boolean validatePassword(String username, String password) {
        if (Pattern.compile(Pattern.quote(username), Pattern.CASE_INSENSITIVE).matcher(password).find() || password.length() < 8) {
            System.out.println("NOT OK");
            return false;
        } else {
            System.out.println("OK");
            return true;
        }

    }
}
