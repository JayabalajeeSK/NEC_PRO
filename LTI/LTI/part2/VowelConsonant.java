package LTI.part2;

import java.util.*;

public class VowelConsonant 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        String withoutVowels = s.replaceAll("[aeiouAEIOU]", "");

        int vowelCount = s.length() - withoutVowels.length();

        int consonantCount = s.replaceAll("[^a-zA-Z]", "").length() - vowelCount;

        System.out.println("Vowel Count: " + vowelCount);
        System.out.println("Consonant Count: " + consonantCount);
        System.out.println("String without vowels: " + withoutVowels);

        sc.close();
    }
}
// Enter a string:
// Hello World JAVA
// Vowel Count: 5
// Consonant Count: 9
// String without vowels: Hll Wrld JV