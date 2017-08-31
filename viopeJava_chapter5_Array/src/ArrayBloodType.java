/**
 * Created by Minh Hoang on 11/07/2017.
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ArrayBloodType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0,00");
        NumberFormat f = NumberFormat.getInstance(Locale.UK);

        String bloodTypes[] = {"A+", "O-", "AB+", "O+", "AB+", "AB+", "O-", "AB+", "O+", "AB+"};
        double counter = 0;
        double percentage;

        System.out.print("Enter blood type: ");
        String userBloodType = input.nextLine();

        if (!userBloodType.isEmpty()) {
            for (int i = 0; i < bloodTypes.length; i++) {
                if (userBloodType.equals(bloodTypes[i])) {
                    counter++;
                }
            }
            percentage = (counter / bloodTypes.length * 100);
            System.out.print(f.format(percentage) + " %");
        } else {
            System.out.print("Blood type cannot be empty.");
        }
    }
}
