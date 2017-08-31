import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * Created by Minh Hoang on 19/07/2017.
 */
public class StringPasswordStrength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password: ");
        String userEntered = input.nextLine();

        if (checkStrength(userEntered)) {
            System.out.println("OK");
        } else {
            System.out.println("The password is not strong enough!");
        }

    }

    private static boolean checkStrength(String password) {
        boolean isMatch = password.matches(
                "(?=.{8,})((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])|(?=.*\\d)(?=.*[a-zA-Z])(?=.*[\\W_])|(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W_])).*"
        );
        if (isMatch) {
            return true;
        } else {
            return false;
        }
    }
}
