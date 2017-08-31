import java.util.Scanner;

public class ValidateSecond {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter grade (0-5): ");
            int grade = Integer.parseInt(input.nextLine());
            if (grade >= 0 && grade <= 5) {
                System.out.print("OK");
            } else {
                System.out.print("Please enter an integer between 0 and 5.");
            }
        } catch (NumberFormatException nfe) {
            System.out.print("Please enter an integer between 0 and 5.");
        }

    }
}
