import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        int factorialNumber = 1;
        int numberEntered = 0;
        //boolean valid = false;

        //do {
        try {
            System.out.print("Enter a non-negative integer: ");
            numberEntered = Integer.parseInt(input.nextLine());
            if (numberEntered >= 0) {
                for (int i = 1; i <= numberEntered; i++) {
                    factorialNumber = factorialNumber * i;
                }
                System.out.print(numberEntered + "! = " + factorialNumber);
                //valid = true;
            } else {
                System.out.print("Please enter a non-negative integer. \n");
            }
        } catch (Exception e) {
            System.out.print("Please enter a non-negative integer. \n");
        }
        //} while (valid == false);

    }
}