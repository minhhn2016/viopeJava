import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String firstEntered = input.nextLine();

        System.out.println("Enter second string: ");
        String secondEntered = input.nextLine();

        if (isAnagram(firstEntered, secondEntered)) {
            System.out.println("Anagram!");
        } else {
            System.out.println("No anagram.");
        }

    }

    private static boolean isAnagram(String firstEntered, String secondEntered) {
        boolean valid;
        if (firstEntered.matches("^[A-ZÅÄÖa-zåäö]+((\\s|\\.|,)*[A-ZÅÄÖa-zåäö]*)*$") && secondEntered.matches("^[A-ZÅÄÖa-zåäö]+((\\s|\\.|,)*[A-ZÅÄÖa-zåäö]*)*$")) {
            String onlyWordCharFirst = firstEntered.trim().replaceAll("(\\s|\\.|,)*", "").toLowerCase();
            String onlyWordCharSecond = secondEntered.trim().replaceAll("(\\s|\\.|,)*", "").toLowerCase();

            char[] firstToCharArray = onlyWordCharFirst.toCharArray();
            char[] secondToCharArray = onlyWordCharSecond.toCharArray();

            Arrays.sort(firstToCharArray);
            Arrays.sort(secondToCharArray);

            valid = Arrays.equals(firstToCharArray, secondToCharArray);
            return valid;
        } else {
            valid = false;
            return valid;
        }
    }
}
