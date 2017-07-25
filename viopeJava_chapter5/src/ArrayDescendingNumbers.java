/**
 * Created by Minh Hoang on 11/07/2017.
 */

import java.util.Scanner;

public class ArrayDescendingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] decimalNumbers = new double[4];
        double temp = 0;
        for (int i = 0; i < decimalNumbers.length; i++) {
            System.out.print("Enter " + (i + 1) + " . number: ");
            decimalNumbers[i] = readDouble(input);

        }
        for (int i = 0; i < decimalNumbers.length; i++) {
            for (int j = i + 1; j < (decimalNumbers.length); j++) {
                if (decimalNumbers[i] < decimalNumbers[j]) {
                    temp = decimalNumbers[j];
                    decimalNumbers[j] = decimalNumbers[i];
                    decimalNumbers[i] = temp;
                }
            }
            System.out.print(decimalNumbers[i] + " ");
        }
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
