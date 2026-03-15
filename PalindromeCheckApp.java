package PalindromeCheckerApp;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<Character>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < input.length(); i++) {
            char ch = stack.pop();

            if (input.charAt(i) != ch) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("It is palindrome? : " + isPalindrome);

        sc.close();
    }
}