import java.util.Scanner;

public class StringLength {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstS = input.nextLine();
        int counter = firstS.length();

        while (firstS.equals("quit") == false) {
            System.out.print("Enter a string: ");
            firstS = input.nextLine();
            counter += firstS.length();
        }
        counter -= 4;

        if (counter > 0) {
            System.out.print("The total length is " + counter);
        } else {
            System.out.print("Nothing entered.");
        }
    }
}