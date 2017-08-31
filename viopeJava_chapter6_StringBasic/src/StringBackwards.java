/**
 * Created by Minh Hoang on 13/07/2017.
 */

import java.util.Scanner;

public class StringBackwards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userEntered = input.nextLine();

        System.out.println(reverse(userEntered));
    }

    private static String reverse(String entered) {
        char[] enteredToArray = new char[entered.length()]; // Array hold input's char
        char temp;
        int begin = 0;
        int end = entered.length() - 1;

        // Loop through input to fill the array of char
        for (int i = 0; i < entered.length(); i++) {
            enteredToArray[i] = entered.charAt(i);
        }

        // Loop through the char array to make modification
        while (end > begin) {
            temp = enteredToArray[begin];
            enteredToArray[begin] = enteredToArray[end];
            enteredToArray[end] = temp;
            begin++;
            end--;
        }
        String enteredModified = new String(enteredToArray);
        return enteredModified;
    }
}
