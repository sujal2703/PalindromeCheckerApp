/*
 * UseCase9 - Recursive Palindrome Checker
 * Goal: Check palindrome using Recursion
 */

import java.util.Scanner;

/*
 * UC11: Object-Oriented Palindrome Service
 * Goal: Encapsulate palindrome logic in a class.
 * Concepts: Encapsulation, SRP, Array
 */


    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;

// Service Class
class PalindromeChecker {

    // Method to check whether string is palindrome
    public boolean checkPalindrome(String input) {

        // Normalize string (ignore case and spaces)
        String normalizedString = input.toLowerCase().replaceAll("\\s+", "");

        char[] charArray = normalizedString.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
 main
        }

        // Recursive Call (Move towards center)
        return isPalindrome(str, start + 1, end - 1);
    }
}

// Application Class
public class PalindromeCheckerApp {

    // Main Method
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println(" Recursive Palindrome Checker ");
        System.out.println("====================================");

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: The string is a PALINDROME ✅");
        } else {
            System.out.println("Result: The string is NOT a palindrome ❌");


        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC11: Object-Oriented Palindrome Service =====");
        System.out.print("Enter a string: ");

        String inputString = scanner.nextLine();

        // Create object of service class
        PalindromeChecker palindromeChecker = new PalindromeChecker();

        boolean result = palindromeChecker.checkPalindrome(inputString);

        if (result) {
            System.out.println("Result: It is a Palindrome.");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
 main
        }

        sc.close();
    }
}