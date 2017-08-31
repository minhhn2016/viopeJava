import java.text.DecimalFormat;
import java.util.Scanner;

public class MethodsThird {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.print("Enter gross salary: ");
        double grossSalary = readDouble(input);

        System.out.print("Enter income tax rate: ");
        double incomeTaxRate = readDouble(input);

        double netSalary = calculateNetSalary(grossSalary, incomeTaxRate);
        System.out.print("The net salary is " + twoDecimals.format(netSalary));
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }

    private static double calculateNetSalary(double grossSalary, double incomeTaxRate) {
        double netSalary = grossSalary - (grossSalary * incomeTaxRate / 100);
        return netSalary;
    }
}
