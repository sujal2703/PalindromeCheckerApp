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
