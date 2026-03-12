import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {


    public static void main(String[] args) {

        // Original string
        String word = "racecar";

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));  // Insert at rear
        }

        boolean isPalindrome = true;

        // Compare front and rear elements
        while (deque.size() > 1) {

            char front = deque.removeFirst();  // Remove from front
            char rear = deque.removeLast();    // Remove from rear

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result

        // Node class for Singly Linked List
        static class Node {
            char data;
            Node next;

            Node(char data) {
                this.data = data;
                this.next = null;
            }
        }

        public static void main(String[] args) {

            String word = "level";

            // Convert string to linked list
            Node head = null;
            Node tail = null;

            for (int i = 0; i < word.length(); i++) {
                Node newNode = new Node(word.charAt(i));

                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                    tail.next = newNode;
                    tail = newNode;
                }
            }

            boolean isPalindrome = checkPalindrome(head);


            if (isPalindrome) {
                System.out.println(word + " is a Palindrome.");
            } else {
                System.out.println(word + " is NOT a Palindrome.");
            }
        }



        // Method to check palindrome using Linked List
        public static boolean checkPalindrome(Node head) {

            if (head == null || head.next == null) {
                return true;
            }

            // Step 1: Find middle using Fast & Slow pointers
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse second half
            Node prev = null;
            Node current = slow;
            Node nextNode;

            while (current != null) {
                nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }

            // Step 3: Compare first half and reversed second half
            Node firstHalf = head;
            Node secondHalf = prev;

            while (secondHalf != null) {
                if (firstHalf.data != secondHalf.data) {
                    return false;
                }
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }

            return true;
        }

    }