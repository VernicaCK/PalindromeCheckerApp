package PalindromeCheckerApp;
import java.util.Scanner;

public class PalindromeCheckApp {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input test:");
        String input=sc.nextLine();
        boolean isPalindrome = true;
        int n=input.length()-1;
        for (int i=0;i<=n;i++){
            if(input.charAt(i)!= input.charAt(n-i)){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("It is palindrome ? :" +isPalindrome);
        }else{
            System.out.println("It is palindrome ? :" +isPalindrome);  
        }
        
    }
}


