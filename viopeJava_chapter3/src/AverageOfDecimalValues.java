
import java.util.Scanner;

public class AverageOfDecimalValues {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number (zero ends): ");
        double firstNumber = readDouble(input);
        int valueCount = 0;
        double sum = firstNumber;

        while (firstNumber != 0) {
            System.out.print("Enter next number (zero ends): ");
            firstNumber = readDouble(input);
            sum += firstNumber;
            valueCount++;
        }
        if (valueCount > 0) {
            double average = sum / valueCount;
            System.out.print("The average is " + average);
        } else {
            System.out.print("Nothing to calculate");
        }
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}