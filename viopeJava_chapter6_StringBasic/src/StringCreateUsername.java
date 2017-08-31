/**
 * Created by Minh Hoang on 13/07/2017.
 */

import java.util.Scanner;

public class StringCreateUsername {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String fName = input.nextLine();

        System.out.print("Enter surname: ");
        String lName = input.nextLine();

        createUsername(fName, lName);

    }

    private static String createUsername(String fName, String lName) {
        String userName;
        char[] firstPart = new char[3];
        char[] secondPart = new char[2];


        if (lName.length() < 3 || fName.length() < 2) {
            System.out.println("Not enough letters to create a username!");
            return null;
        } else {
            for (int i = 0; i < firstPart.length; i++) {
                firstPart[i] = lName.charAt(i);
            }
            for (int i = 0; i < secondPart.length; i++) {
                secondPart[i] = fName.charAt(i);
            }
            String a = new String(firstPart);
            String b = new String(secondPart);

            userName = a + b;
            System.out.println(userName.toLowerCase());
            return userName;
        }

    }
}
