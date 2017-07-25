import java.util.Scanner;

public class StringEquality {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String firstS = input.nextLine();

        System.out.print("Enter second string: ");
        String secondS = input.nextLine();

        if (firstS.equals(secondS)) {
            System.out.print("Equal");
        } else {
            System.out.print("Not equal");
        }
    }
}
