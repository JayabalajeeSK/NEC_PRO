package Hexaware.String;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckStack 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase(); 

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) 
        {
            stack.push(str.charAt(i));
        }

        boolean isPalindrome = true;

        for (int i = 0; i < str.length(); i++) 
        {
            if (str.charAt(i) != stack.pop()) 
            {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) 
        {
            System.out.println("Palindrome!");
        } 
        else 
        {
            System.out.println("Not a palindrome!");
        }

        sc.close();
    }
}
// Enter a string: Jaj 
// Palindrome!