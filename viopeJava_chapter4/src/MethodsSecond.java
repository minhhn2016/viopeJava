
import java.util.Scanner;

public class MethodsSecond {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width: ");
        int width = Integer.parseInt(input.nextLine());

        System.out.print("Enter height: ");
        int height = Integer.parseInt(input.nextLine());

        System.out.println();

        printRectangle(width, height);
    }

    private static int printRectangle(int x, int y) {
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
        return x * y;
    }
}