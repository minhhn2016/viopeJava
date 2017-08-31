import java.util.Scanner;

public class StringRemoveSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String userEntered = input.nextLine();
        System.out.println("\"" + removeExtraSpace(userEntered) + "\"");
    }

    private static String removeExtraSpace(String userEntered) {
        String noWhitespace = userEntered.trim().replaceAll("\\s+", " ");
        return noWhitespace;
    }
}
