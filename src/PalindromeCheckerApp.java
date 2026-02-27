/*
 * UseCase9 - Recursive Palindrome Checker
 * Goal: Check palindrome using Recursion
 */

import java.util.Scanner;

class PalindromeCheckerApp {

    // Recursive method to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call (Move towards center)
        return isPalindrome(str, start + 1, end - 1);
    }

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
        }

        sc.close();
    }
}