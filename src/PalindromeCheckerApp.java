public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        boolean isPalindrome = checkPalindrome(word, 0, word.length() - 1);

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }

    // Recursive method
    public static boolean checkPalindrome(String str, int start, int end) {

        // Base Condition: If start crosses end → palindrome
        if (start >= end) {
            return true;
        }

        // If characters don't match → not palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive Call (shrink problem)
        return checkPalindrome(str, start + 1, end - 1);
    }
}