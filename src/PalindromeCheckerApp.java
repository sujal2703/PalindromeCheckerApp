import java.util.Scanner;

class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== UC10: Case-Insensitive & Space-Ignored Palindrome =====");
        System.out.print("Enter a string: ");

        String input = sc.nextLine();

        // Step 1: Normalize the string
        // Convert to lowercase and remove spaces
        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        // Step 2: Convert to char array
        char[] arr = normalized.toCharArray();

        // Step 3: Check palindrome using two-pointer method
        boolean isPalindrome = true;

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Step 4: Print result
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        sc.close();
    }
}