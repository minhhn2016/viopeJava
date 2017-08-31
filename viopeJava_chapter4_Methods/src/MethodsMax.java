import java.util.Scanner;

public class MethodsMax {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first double: ");
        double firstD = readDouble(input);

        System.out.print("Enter second double: ");
        double secondD = readDouble(input);

        System.out.print("The max value is " + max(firstD, secondD));
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }

    private static double max(double a, double b) {
        double maxValue = 0;
        if (a > b) {
            maxValue = a;
        } else if (a < b) {
            maxValue = b;
        } else {
            System.out.print("Two values are equal. ");
        }
        return maxValue;
    }
}
