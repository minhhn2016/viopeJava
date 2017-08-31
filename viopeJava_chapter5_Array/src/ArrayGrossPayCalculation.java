/**
 * Created by Minh Hoang on 12/07/2017.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class ArrayGrossPayCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###");

        double totalHour = 0;
        double dailyHour = 0;
        double extraHour = 0;

        System.out.println("Enter your hourly wage: ");
        double hourlyWage = readDouble(input);

        System.out.println("Enter the number of days: ");
        int numberOfDay = Integer.parseInt(input.nextLine());
        double[] dailyHourArray = new double[numberOfDay];

        for (int i = 0; i < dailyHourArray.length; i++) {
            System.out.println("Hours worked on day " + (i + 1) + ":");
            dailyHourArray[i] = readDouble(input);
            if (dailyHourArray[i] > 8) {
                extraHour = (dailyHourArray[i] - 8) / 2;
            }
            else {
                extraHour = 0;
            }
            dailyHour = dailyHour + dailyHourArray[i] + extraHour;
            totalHour += dailyHourArray[i];
        }

        System.out.println("Total work hours is " + df.format(totalHour));
        System.out.println("Gross pay is " + df.format(hourlyWage * dailyHour));
        System.out.println("You entered the following daily hours: " + displayHour(dailyHourArray));
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }

    private static String displayHour(double[] hourArray) {
        DecimalFormat df = new DecimalFormat("###");
        String show = "";
        for (int i = 0; i < hourArray.length; i++) {
            show = show + df.format(hourArray[i]) + " ";
        }
        return show;
    }
}
