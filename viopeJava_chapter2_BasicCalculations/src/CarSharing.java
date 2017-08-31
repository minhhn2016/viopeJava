
import java.util.Scanner;
import java.text.DecimalFormat;

public class CarSharing {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.print("Enter driven kilometers: ");
        double drivenKm = readDouble(input);

        System.out.print("Enter fuel consumption per 100 km: ");
        double fuelPer100Km = readDouble(input);

        System.out.print("Enter fuel price per liter: ");
        double fuelPricePerLiter = readDouble(input);

        System.out.print("Enter number of people: ");
        int numberOfPeople = Integer.parseInt(input.nextLine());


        double pricePerPerson = (drivenKm / 100 * fuelPer100Km * fuelPricePerLiter) / numberOfPeople;
        System.out.println("\nEach of the " + numberOfPeople + " people should pay " + twoDecimals.format(pricePerPerson) + " euros.");
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
