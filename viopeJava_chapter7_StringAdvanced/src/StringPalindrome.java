import java.util.Arrays;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userEntered = input.nextLine();

        if (isPalindrome(userEntered)) {
            System.out.println("The text is a palindrome.");
        } else {
            System.out.println("No palindrome.");
        }

    }

    private static boolean isPalindrome(String userEntered) {
        boolean valid;
        if (userEntered.matches("^[A-ZÅÄÖa-zåäö]+((\\s|\\.|,|:|;|\\?|!|-|'|\")*[A-ZÅÄÖa-zåäö]*)*$")) {
            String onlyWordChar = userEntered.trim().replaceAll("(\\s|\\.|,|:|;|\\?|!|-|'|\")*", "").toLowerCase();
            String reversedOnlyWordChar = new StringBuilder(onlyWordChar).reverse().toString();

            char[] charArray = onlyWordChar.toCharArray();
            char[] reversedCharArray = reversedOnlyWordChar.toCharArray();

            return valid = Arrays.equals(charArray, reversedCharArray);

        } else {
            return valid = false;
        }
    }
}
