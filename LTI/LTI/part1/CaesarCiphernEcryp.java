package LTI.part1;

import java.util.*;

public class CaesarCiphernEcryp 
{

    public static StringBuffer encrypt(String text, int s) 
	{
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) 
		{
            char c = text.charAt(i);

            if (Character.isUpperCase(c)) 
			{
                char ch = (char) (((c - 'A' + s) % 26) + 'A');
                result.append(ch);
            } 
            else if (Character.isLowerCase(c)) 
			{
                char ch = (char) (((c - 'a' + s) % 26) + 'a');
                result.append(ch);
            } 
            else 
			{
                result.append(c);
            }
        }
        return result;
    }

    public static void main(String[] args) 
	{    
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();  
        int s = 3;

        System.out.println(encrypt(text, s));
        sc.close();
    }
}


// JAYABALAJEE S K
// MDBDEDODMHH V N

// jayabalajee s k
// mdbdedodmhh v n

// abcdefghijklmnopqrstuvwxyz
// defghijklmnopqrstuvwxyzabc