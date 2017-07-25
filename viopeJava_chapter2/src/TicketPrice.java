
import java.util.Scanner;
import java.text.DecimalFormat;

public class TicketPrice {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.print("Enter price for a single ticket: ");
        double singleTicket = readDouble(input);

        System.out.print("Enter price for a season ticket: ");
        double seasonTicket = readDouble(input);

        System.out.print("Enter the number of bus trips per month: ");
        int numberOfTrips = Integer.parseInt(input.nextLine());

        double singleTicketPrice = singleTicket * numberOfTrips;
        double priceDifference = Math.abs(singleTicketPrice - seasonTicket);

        if (singleTicketPrice > seasonTicket) {
            System.out.println("\nBuying a season ticket is " + twoDecimals.format(priceDifference) + " euros cheaper.");
        } else if (singleTicketPrice < seasonTicket) {
            System.out.println("\nBuying single tickets is " + twoDecimals.format(priceDifference) + " euros cheaper.");
        } else {
            System.out.println("\nThere is no difference in the price.");
        }
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
