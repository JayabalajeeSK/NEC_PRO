package Hexaware.String;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class WordCountCollection 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        String[] words = sentence.split(" ");

        List<String> wordList = new ArrayList<>();
        for (String word : words) 
        {
            wordList.add(word);
        }

        System.out.println("Word count: " + wordList.size());

        sc.close();
    }
}
// Enter a sentence: hello world java
// Word count: 3