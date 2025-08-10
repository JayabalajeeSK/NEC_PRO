package EV.Arrays.TwoPointer.SlidingWindow;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestUniqueSubstring 
{
    public int lengthOfLongestSubstring(String str) 
    {
        Set<Character> set = new HashSet<>();
        int max = 0, left = 0;

        for (int right = 0; right < str.length(); right++) 
        {
            char currentChar = str.charAt(right);

            // If character is already in the set, remove from left side
            while (set.contains(currentChar)) 
            {
                set.remove(str.charAt(left));
                left++;
            }

            // Add current character to set
            set.add(currentChar);

            // Update maximum length
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read input string
        // Example input: abcab
        String input = scanner.nextLine();

        LongestUniqueSubstring obj = new LongestUniqueSubstring();
        int result = obj.lengthOfLongestSubstring(input);

        // Output the result
        System.out.println("Length of longest substring without repeating characters: " + result);

        scanner.close();
    }
}
// abcba
// Length of longest substring without repeating characters: 3