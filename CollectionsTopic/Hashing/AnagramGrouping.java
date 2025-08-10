package CollectionsTopic.Hashing;

import java.util.*;

public class AnagramGrouping 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.println("Enter words separated by spaces:");
        String input = sc.nextLine();
        String[] words = input.split(" ");

        // Map to store anagram groups
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) 
        {
            // Convert word to char array, sort it, and get the sorted key
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            // Group words by their sorted key
            map.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }

        // Print grouped anagrams
        System.out.println("\nGrouped Anagrams:");
        for (List<String> group : map.values()) 
        {
            System.out.println(group);
        }

        sc.close();
    }
}
// Enter words separated by spaces:
// cat dog tac atc eva

// Grouped Anagrams:
// [eva]
// [cat, tac, atc]
// [dog]