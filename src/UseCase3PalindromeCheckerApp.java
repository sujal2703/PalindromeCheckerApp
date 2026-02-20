public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "radar";
        String reversed = "";

        // Loop through the string backwards
        // We start at the last index (length - 1) and go to 0
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i); // String concatenation
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // Compare content using .equals()
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("Result: It is a Palindrome!");
        } else {
            System.out.println("Result: It is NOT a Palindrome.");
        }
    }
}
