package Hexaware.String;

import java.util.Scanner;

public class PalindromeCheck2P
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;
        
        while(start < end) 
        {
            if(Character.toLowerCase(str.charAt(start)) != Character.toLowerCase(str.charAt(end))) 
            {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        
        if(isPalindrome) 
        {
            System.out.println(str + " - is a palindrome");
        } 
        else 
        {
            System.out.println(str + " - is not a palindrome");
        }
        
        sc.close();
    }
}

// Enter a string: Mam 
// Mam - is a palindrome