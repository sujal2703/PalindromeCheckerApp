 feature/UC12
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

/*
 * UC13: Performance Comparison
 * Goal: Compare different palindrome algorithms
 * Concept: System.nanoTime()
 */

class PalindromeAlgorithms {

    // Method 1: Two Pointer Approach
    public static boolean checkUsingTwoPointer(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        char[] arr = normalized.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack Approach
    public static boolean checkUsingStack(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // Method 3: Deque Approach
    public static boolean checkUsingDeque(String input) {

        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < normalized.length(); i++) {
            deque.addLast(normalized.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC13: Performance Comparison =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Two Pointer Timing
        long start1 = System.nanoTime();
        boolean result1 = PalindromeAlgorithms.checkUsingTwoPointer(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Stack Timing
        long start2 = System.nanoTime();
        boolean result2 = PalindromeAlgorithms.checkUsingStack(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Deque Timing
        long start3 = System.nanoTime();
        boolean result3 = PalindromeAlgorithms.checkUsingDeque(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Result      : " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Result      : " + result3 + " | Time: " + time3 + " ns");

        scanner.close();
    }
}
=======
 feature/UC3
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String original = "madam";
        String reversed = "";

        System.out.println("Original String: " + original);

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        if (original.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}
=======
 feature/UC5
import java.util.Stack;
public class PalindromeCheckerApp {public static void main(String[] args) {
    String input = "racecar";
    Stack<Character> stack = new Stack<>();

    // 1. Push all characters onto the stack
    for (int i = 0; i < input.length(); i++) {
        stack.push(input.charAt(i));
    }

    // 2. Pop characters and build the reversed string
    String reversed = "";
    while (!stack.isEmpty()) {
        reversed += stack.pop();
    }

    System.out.println("Input String: " + input);
    System.out.println("Reversed from Stack: " + reversed);

    // 3. Validation
    if (input.equals(reversed)) {
        System.out.println("Result: It is a Palindrome!");
    } else {
        System.out.println("Result: It is NOT a Palindrome.");
    }
}
}

 feature/UC6
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
 feature/UC4
        String input = "deified";

        // Convert String to a character array
        char[] charArray = input.toCharArray();

        boolean isPalindrome = true;
        int left = 0;
        int right = charArray.length - 1;

        // Two-pointer approach: compare from both ends moving inward
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                isPalindrome = false;
                break; // Exit early if a mismatch is found
            }
            left++;
            right--;
        }

        System.out.println("Checking string: " + input);
        if (isPalindrome) {
            System.out.println("Result: It is a Palindrome!");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}

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
 main
 main
 main
 main
