package Zoho.Round_2;

import java.util.Scanner;

public class Z2_AddInBase 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        int base = sc.nextInt();
        sc.close();

        System.out.println(addInBase(n1, n2, base));
    }

    public static String addInBase(String n1, String n2, int base) 
    {
        StringBuilder res = new StringBuilder();
        int i = n1.length() - 1;
        int j = n2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) 
        {
            int d1 = 0;
            int d2 = 0;

            if (i >= 0) 
            {
                d1 = n1.charAt(i) - '0';
                i--;  
            }

            if (j >= 0) {
                d2 = n2.charAt(j) - '0';
                j--;  
            }

            int sum = d1 + d2 + carry;

            res.insert(0, sum % base);
            carry = sum / base;
        }

        return res.toString();
    }
}
// 123 13 4
// 202

// 1010 11001 2
// 100011

// 45236 123456 7
// 202025