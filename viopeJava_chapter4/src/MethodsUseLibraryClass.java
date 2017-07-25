import  java.util.Scanner;
/**
 * Created by Minh Hoang on 10/07/2017.
 */
public class MethodsUseLibraryClass {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = Integer.parseInt(input.nextLine());

        System.out.print(a + "! = " + MethodsLibrary.factorial(a));
    }
}