import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {
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
    }
}