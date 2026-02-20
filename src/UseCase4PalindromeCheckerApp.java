public class UseCase4PalindromeCheckerApp {
    public static void main(String[] args) {
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
