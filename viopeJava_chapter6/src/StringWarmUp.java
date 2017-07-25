/**
 * Created by Minh Hoang on 13/07/2017.
 */
import java.util.Scanner;

public class StringWarmUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userEntered = input.nextLine();

        System.out.println(userEntered.length() + " characters");
        System.out.println(userEntered.toUpperCase());
        System.out.println(userEntered.toLowerCase());
    }
}
