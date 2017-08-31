
public class MethodsPrimes {

    public static void main(String[] args) {
        // write your code here
        int[] primeNumbers = new int[20];
        int n = 2;
        for (int i = 0; i < primeNumbers.length; i++) {
            while (!isPrime(n)) {
                n++;
            }
            primeNumbers[i] = n;
            n++;
            System.out.print(primeNumbers[i] + " ");
        }
    }

    private static boolean isPrime(int n) {
        boolean result = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
}
