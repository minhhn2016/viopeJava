import java.util.Scanner;
import java.text.DecimalFormat;

public class DiscountPrice {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.print("Enter original price: ");
        double originalPrice = readDouble(input);

        System.out.print("Enter discount percentage: ");
        double discountPercentage = readDouble(input);

        double finalPrice = originalPrice - (originalPrice * discountPercentage / 100);
        System.out.print("The final price is " + twoDecimals.format(finalPrice));
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
