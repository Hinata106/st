import java.util.Scanner;

public class FactorialCalculator {

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();

        int factorial = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);

        scanner.close();
    }
}
