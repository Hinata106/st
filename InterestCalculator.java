import java.util.Scanner;

public class InterestCalculator {

    public static double calculateSimpleInterest(double principal, double time, String customerType) {
        double rateOfInterest = customerType.equalsIgnoreCase("senior citizen") ? 0.12 : 0.10;
        return principal * rateOfInterest * time;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.println("Enter the time period: ");
        double time = scanner.nextDouble();

        System.out.println("Enter the customer type (Senior Citizen/Other): ");
        String customerType = scanner.next();

        double simpleInterest = calculateSimpleInterest(principal, time, customerType);
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();
    }
}
