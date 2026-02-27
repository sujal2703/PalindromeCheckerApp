 feature/UC6
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "noon";

        // Stack for LIFO (Backwards)
        Stack<Character> stack = new Stack<>();
        // Queue for FIFO (Forwards) - Using LinkedList as the implementation
        Queue<Character> queue = new LinkedList<>();

        // 1. Load both structures
        for (char ch : input.toCharArray()) {
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        // 2. Compare character by character
        while (!stack.isEmpty()) {
            // pop() gets the last char, poll() gets the first char
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input word: " + input);
        if (isPalindrome) {
            System.out.println("Result: Matches! It is a Palindrome.");
        } else {
            System.out.println("Result: Mismatch! Not a Palindrome.");
        }



import java.util.*;

class PalindromeCheckerApp {

    // Method to check palindrome using Deque
    public static boolean isPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        // Compare front and rear elements
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                return false;
            }
        }

        return true;
    }

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
public class PalindromeCheckerApp { main

    // Main Method
    public static void main(String[] args) {

 feature/UC7
        Scanner sc = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println(" Deque Based Palindrome Checker ");
        System.out.println("====================================");

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Result: The string is a PALINDROME ✅");
        } else {
            System.out.println("Result: The string is NOT a palindrome ❌");
        }



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
 main
        sc.close();
main
    }
}
