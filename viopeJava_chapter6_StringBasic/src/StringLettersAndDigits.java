/**
 * Created by Minh Hoang on 13/07/2017.
 */

import java.util.Scanner;

public class StringLettersAndDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int countLetter = 0;
        int countDigit = 0;

        System.out.println("Enter a string: ");
        String userEntered = input.nextLine();

        for (int i = 0; i < userEntered.length(); i++) {
            if (Character.isDigit(userEntered.charAt(i))) {
                countDigit++;
            } else if (Character.isLetter(userEntered.charAt(i))) {
                countLetter++;
            }
        }
        System.out.println(countLetter + " letter(s)");
        System.out.println(countDigit + " digit(s)");

    }

}
