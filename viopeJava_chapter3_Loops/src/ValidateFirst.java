import java.util.Scanner;

public class ValidateFirst {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter grade (0-5): ");
            int grade = Integer.parseInt(input.nextLine());
            if (grade >= 0 && grade <= 5) {
                System.out.print("OK");
            } else {
                System.out.print("Please enter a valid grade between 0 and 5");
            }
        } catch (NumberFormatException nfe) {
            System.out.print("Please enter an integer.");
        }

    }
}
