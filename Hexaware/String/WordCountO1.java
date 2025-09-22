package Hexaware.String;

import java.util.Scanner;

public class WordCountO1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < sentence.length(); i++) 
        {
            if (!Character.isWhitespace(sentence.charAt(i))) 
            {
                if (!inWord) 
                {
                    inWord = true;
                    count++;
                }
            } 
            else 
            {
                inWord = false;
            }
        }

        System.out.println("Word count: " + count);

        sc.close();
    }
}

// Enter a sentence: hello world java
// Word count: 3