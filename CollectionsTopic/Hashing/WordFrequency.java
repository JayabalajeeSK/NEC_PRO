package CollectionsTopic.Hashing;

import java.util.*;

public class WordFrequency 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.println("Enter words separated by space:");
        String input = sc.nextLine();
        String[] words = input.split(" ");

        // Map to store word frequencies
        Map<String, Integer> freq = new HashMap<>();

        for (String word : words) 
        {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        // Print frequencies
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : freq.entrySet()) 
        {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}
// jayabala jaya jb tharun Tharun jb Jaya balajee bala balajee

// Word Frequencies:
// Tharun -> 1
// tharun -> 1
// jb -> 2
// bala -> 1
// jayabala -> 1
// Jaya -> 1
// jaya -> 1
// balajee -> 2