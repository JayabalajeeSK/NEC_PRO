package LTI.part2;

import java.util.Scanner;

public class ReverseProgram 
{

    public static String reverseFullString(String str) 
    {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reverseEachWord(String str) 
    {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) 
        {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }

    public static String reverseWordOrder(String str) 
    {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) 
        {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(reverseFullString(input));

        System.out.println(reverseEachWord(input));

        System.out.println(reverseWordOrder(input));

        sc.close();
    }
}
// Hello World

// dlroW olleH
// olleH dlroW
// World Hello