import java.util.Scanner;

public class NumberCalculator {

    public static double findSquare(double number) {
        return number * number;
    }

    public static double findCube(double number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        double number = scanner.nextDouble();

        double square = findSquare(number);
        double cube = findCube(number);

        System.out.println("Square of " + number + " is: " + square);
        System.out.println("Cube of " + number + " is: " + cube);

        scanner.close();
    }
}
