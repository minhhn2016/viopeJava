/**
 * Created by Minh Hoang on 13/07/2017.
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegExVowelsOnly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userEntered = input.nextLine();

        String pattern = "^[aeyiuoåöä]+$";
        boolean isMatch = Pattern.matches(pattern, userEntered.toLowerCase());
        if (isMatch) {
            System.out.println("Vowels only");
        } else {
            System.out.println("Not only vowels!");
        }
    }
}
