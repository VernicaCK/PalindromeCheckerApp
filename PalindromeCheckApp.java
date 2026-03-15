package PalindromeCheckerApp;

import java.util.Scanner;

public class PalindromeCheckApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        // Convert string to character array
        char[] chars = input.toCharArray();

        boolean isPalindrome = true;

        int start = 0;
        int end = chars.length - 1;

        // Two pointer comparison
        while (start < end) {

            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("It is palindrome? : " + isPalindrome);
        } else {
            System.out.println("It is palindrome? : " + isPalindrome);
        }

        sc.close();
    }
}