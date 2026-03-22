
package PalindromeCheckerApp;

import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        // Create Deque
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("It is palindrome? : " + isPalindrome);

        sc.close();
    }
}