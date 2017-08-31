import java.util.Scanner;
import java.text.DecimalFormat;

public class DrivingCost {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.println("Enter driven kilometers: ");
        int drivenKm = Integer.parseInt(input.nextLine());

        System.out.println("Enter amount of fuel consumed: ");
        double fuelConsumed = readDouble(input);

        System.out.println("Enter fuel price per liter: ");
        double fuelPricePerLiter = readDouble(input);

        double costPerKm = fuelConsumed / drivenKm * fuelPricePerLiter;
        System.out.println("The cost per kilometer is " + twoDecimals.format(costPerKm) + " euros.");
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
