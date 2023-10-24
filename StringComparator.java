import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string: ");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are not equal.");
        }

        scanner.close();
    }

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }
}

