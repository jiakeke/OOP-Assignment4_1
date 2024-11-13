import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        System.out.println("Enter a string to check if it is a palindrome:");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (checkPalindrome(transformInput(input))) {
            System.out.println("The transformed input is a palindrome.");
        } else {
            System.out.println("The transformed input is not a palindrome.");
        }
    }

    public static String transformInput(String input) {
        input = input.toLowerCase(); // Convert to lowercase
        input = input.replaceAll("\\p{Punct}", ""); // Remove punctuation
        return input;
    }

    public static boolean checkPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i)); // Append each character in reverse order
        }
        return reversed.toString();
    }
}
