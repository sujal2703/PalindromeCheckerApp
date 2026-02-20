public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args) {
        // 1. Define a hardcoded string literal
        String original = "madam";

        // 2. Use StringBuilder to reverse the string
        String reversed = new StringBuilder(original).reverse().toString();

        // 3. Conditional logic to check if it's a palindrome
        if (original.equals(reversed)) {
            System.out.println("The string '" + original + "' is a palindrome.");
        } else {
            System.out.println("The string '" + original + "' is NOT a palindrome.");
        }
    }
}
