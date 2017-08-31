import java.util.Scanner;

public class SumOfTwoIntegers {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstInt = Integer.parseInt(input.nextLine());

        System.out.print("Enter second integer: ");
        int secondInt = Integer.parseInt(input.nextLine());

        System.out.print(firstInt + " + " + secondInt + " = " + (firstInt + secondInt));
    }
}