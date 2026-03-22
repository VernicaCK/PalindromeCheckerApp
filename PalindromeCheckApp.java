package PalindromeCheckerApp;

import java.util.Scanner;

// Service class
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}

// Main class
public class PalindromeCheckApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        System.out.println("It is palindrome? : " + result);

        sc.close();
    }
}