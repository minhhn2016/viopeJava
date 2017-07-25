import java.util.Scanner;

public class GreetMe {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Hello, " + firstName + "!");
    }
}
