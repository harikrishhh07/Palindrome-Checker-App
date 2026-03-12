public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original String
        String input = "A man a plan a canal Panama";

        // Step 1: Normalize the string
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Step 2: Apply palindrome logic
        boolean isPalindrome = checkPalindrome(normalized);

        // Display Result
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a Palindrome (Ignoring spaces & case).");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome.");
        }
    }

    // Method to check palindrome using two-pointer approach
    public static boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}