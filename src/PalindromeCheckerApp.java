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