import java.util.Scanner;

public class StringCount {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your string (leave blank and press Enter to quit): ");
        String userEntered = input.nextLine();

        int counter = 0;

        while (userEntered.isEmpty() == false) {
            System.out.print("Enter your string (leave blank and press Enter to quit): ");
            userEntered = input.nextLine();
            counter++;
        }
        if (counter > 0) {
            System.out.print("Number of strings entered: " + counter + " (excluding the exit empty one)");
        } else {
            System.out.print("There was not any string entered.");
        }
    }
}
