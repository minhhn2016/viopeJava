public class MethodsLibrary {

    public static int factorial(int a) {
        int factorialOfInput = 1;
        for (int i = 1; i <= a; i++) {
            factorialOfInput = factorialOfInput * i;
        }
        return factorialOfInput;
    }
}

