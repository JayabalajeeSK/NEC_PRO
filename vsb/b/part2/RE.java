package vsb.b.part2;

import java.util.Scanner;

public class RE 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String noVowels = input.replaceAll("(?i)[aeiou]", "");
        System.out.println(noVowels);
        
        String noConsonants = input.replaceAll("(?i)[a-z&&[^aeiou]]", "");
        System.out.println(noConsonants);
        String noSpecial = input.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(noSpecial);
        sc.close();
        
    }
    
}
