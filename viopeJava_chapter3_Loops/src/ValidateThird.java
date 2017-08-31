
import java.util.Scanner;

public class ValidateThird {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        String grade = "";
        int gradeToInt = 0;
        boolean valid = false;

        do {
            try {
                System.out.print("Enter grade (0-5): ");
                grade = input.nextLine();
                gradeToInt = Integer.parseInt(grade);
                if (gradeToInt >= 0 && gradeToInt <= 5) {
                    valid = true;
                    System.out.print("OK");
                } else {
                    System.out.print(grade + " is not a valid grade.\n");
                }
            } catch (Exception e) {
                System.out.print(grade + " is not a valid grade.\n");
            }
        }
        while (valid == false);

    }
}