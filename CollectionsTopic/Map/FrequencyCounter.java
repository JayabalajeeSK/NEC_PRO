package CollectionsTopic.Map;

import java.util.*;

public class FrequencyCounter 
{
    public static void main(String[] args) 
    {
        // ✅ Part 1: Frequency Count for Characters in a String
        String str = "jayabalajee";
        Map<Character, Integer> charFreq = new HashMap<>();

        for (char ch : str.toCharArray()) 
        {
            if (ch != ' ') 
            {
                charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
            }
        }

        System.out.println("Character Frequency:");
        for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) 
        {
            System.out.println("'" + entry.getKey() + "' → " + entry.getValue() + " times");
        }

        // ✅ Part 2: Frequency Count for Integers in an Array
        int[] numbers = {1, 2, 2, 3, 1, 4, 2};
        Map<Integer, Integer> intFreq = new HashMap<>();

        for (int num : numbers) 
        {
            intFreq.put(num, intFreq.getOrDefault(num, 0) + 1);
        }

        System.out.println("\nInteger Frequency:");
        for (Map.Entry<Integer, Integer> entry : intFreq.entrySet()) 
        {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " times");
        }
    }
}
// Character Frequency:
// 'a' ? 4 times
// 'b' ? 1 times
// 'e' ? 2 times
// 'y' ? 1 times
// 'j' ? 2 times
// 'l' ? 1 times

// Integer Frequency:
// 1 ? 2 times
// 2 ? 3 times
// 3 ? 1 times
// 4 ? 1 times