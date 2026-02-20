public class UseCase3PalindromeCheckerApp {

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
