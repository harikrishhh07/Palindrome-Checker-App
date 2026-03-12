import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "racecar";

        // ----- Two Pointer Method -----
        long startTime1 = System.nanoTime();

        boolean result1 = checkPalindromeTwoPointer(word);

        long endTime1 = System.nanoTime();

        long timeTaken1 = endTime1 - startTime1;


        // ----- Stack Method -----
        long startTime2 = System.nanoTime();

        boolean result2 = checkPalindromeStack(word);

        long endTime2 = System.nanoTime();

        long timeTaken2 = endTime2 - startTime2;


        // Display results
        System.out.println("Word: " + word);

        System.out.println("\nTwo Pointer Method Result: " + result1);
        System.out.println("Execution Time: " + timeTaken1 + " ns");

        System.out.println("\nStack Method Result: " + result2);
        System.out.println("Execution Time: " + timeTaken2 + " ns");
    }


    // Method 1: Two Pointer Approach
    public static boolean checkPalindromeTwoPointer(String str) {

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


    // Method 2: Stack Approach
    public static boolean checkPalindromeStack(String str) {

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}