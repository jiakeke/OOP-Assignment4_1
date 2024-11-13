
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it is a palindrome:");
        String input = scanner.nextLine();

        String transformed = transformInput(input);

        if (isPalindrome(transformed)) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
        scanner.close();
    }

    public static String transformInput(String input) {
        return input.toLowerCase().replaceAll("[,!]", "");
    }

    public static boolean isPalindrome(String input) {
        return input.equals(reverseString(input));
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
