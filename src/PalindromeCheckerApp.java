import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));   // Push operation
        }

        boolean isPalindrome = true;

        // Pop characters and compare with original string
        for (int i = 0; i < word.length(); i++) {
            char poppedChar = stack.pop();   // Pop operation

            if (word.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}