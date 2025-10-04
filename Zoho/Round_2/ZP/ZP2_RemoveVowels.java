package Zoho.Round_2.ZP;

import java.util.*;

public class ZP2_RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        ));

        StringBuilder sb = new StringBuilder();
        int n = input.length();
        int i = 0;

        while (i < n) {
            char ch = input.charAt(i);

            if (vowels.contains(ch)) {
                
                int start = i;
                while (i < n && vowels.contains(input.charAt(i))) {
                    i++;
                }
                int count = i - start;

                if (count >= 2) {
                   
                    sb.append(input, start, i);
                }
              
            } else {
                sb.append(ch);
                i++;
            }
        }

        System.out.println(sb.toString());
    }
}
// compuuter
// cmpuutr

// cat
// ct