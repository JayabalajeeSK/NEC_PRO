package CollectionsTopic.Hashing;

import java.util.Scanner;

public class CustomHash 
{
    public static int customHash(String s) 
    {
        int hash = 7; // seed value
        int prime = 31; // prime multiplier
        for (int i = 0; i < s.length(); i++) 
        {
            hash = hash * prime + s.charAt(i);
        }
        return Math.abs(hash); // ensure non-negative
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input1 = sc.nextLine();
        System.out.println("Hash of \"" + input1 + "\": " + customHash(input1));

        System.out.print("Enter another string: ");
        String input2 = sc.nextLine();
        System.out.println("Hash of \"" + input2 + "\": " + customHash(input2));

        sc.close();
    }
}
// Enter a string: jb
// Hash of "jb": 10111
// Enter another string: vj
// Hash of "vj": 10491