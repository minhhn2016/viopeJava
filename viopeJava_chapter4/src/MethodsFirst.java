
public class MethodsFirst {

    public static void main(String[] args) {
        // write your code here
        printNumbers();
    }

    public static int[] printNumbers() {
        int base = 2;
        int[] evenNumbers = new int[26];
        for (int i = 1; i <= 25; i++) {
            evenNumbers[i] = i * base;
            System.out.print(evenNumbers[i] + " ");
        }
        return evenNumbers;
    }
}
