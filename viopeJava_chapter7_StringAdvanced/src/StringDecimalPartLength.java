/**
 * Created by Minh Hoang on 19/07/2017.
 */

import java.util.Scanner;

public class StringDecimalPartLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        String userEntered = input.nextLine();

        int decimalPointIndex = 0;
        int counter = 0;

        if (userEntered.matches("^[+-]?[0-9]+((,|\\.){1}[0-9]+)?$")) {
            if (userEntered.indexOf(".") == -1) {
                decimalPointIndex = userEntered.indexOf(",");
            } else if (userEntered.indexOf(",") == -1) {
                decimalPointIndex = userEntered.indexOf(".");
            }

            for (int i = decimalPointIndex + 1; i < userEntered.length(); i++) {
                counter++;
            }
            System.out.println(counter + " decimal place(s)");

        } else {
            System.out.println("Please enter a proper decimal number");

        }

    }

}
