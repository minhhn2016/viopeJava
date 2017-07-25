/**
 * Created by Minh Hoang on 13/07/2017.
 */

import java.util.Scanner;

public class RegExValidateUsernameFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userEntered = input.nextLine();

        if (userEntered.matches("a[0-9]{7}(@haaga-helia.fi|@myy.haaga-helia.fi)")) {
            System.out.println("OK");
        } else {
            System.out.println("Invalid username format");
        }
    }
}
