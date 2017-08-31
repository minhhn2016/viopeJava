/**
 * Created by Minh Hoang on 13/07/2017.
 */

import java.util.Scanner;

public class RegExValidateSize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        String userEntered = input.nextLine();

        if (userEntered.matches("XS|S|M|L|XL")) {
            System.out.println("OK");
        } else {
            System.out.println("Invalid size");
        }
    }
}
