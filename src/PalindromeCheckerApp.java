import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "rotator";
        Deque<Character> deque = new ArrayDeque<>();

        // 1. Add all characters to the Deque
        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        boolean isPalindrome = true;

        // 2. Compare first and last until 0 or 1 character remains
        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        if (isPalindrome) {
            System.out.println("Result: Deque validation successful! It is a Palindrome.");
        } else {
            System.out.println("Result: Deque validation failed! Not a Palindrome.");
        }
    }
}
