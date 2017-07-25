
import java.util.Scanner;
import java.text.DecimalFormat;

public class AgentCommission {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDecimals = new DecimalFormat("0.00");

        System.out.print("Enter selling price: ");
        double sellingPrice = readDouble(input);

        double agentCommission = sellingPrice * 3.44 / 100;
        if (agentCommission < 2400) {
            agentCommission = 2400;
            System.out.println("The commission is " + twoDecimals.format(agentCommission) + " euros.");
        } else {
            System.out.println("The commission is " + twoDecimals.format(agentCommission) + " euros.");
        }
    }

    private static double readDouble(Scanner input) {
        return Double.parseDouble(input.nextLine().replace(',', '.'));
    }
}
