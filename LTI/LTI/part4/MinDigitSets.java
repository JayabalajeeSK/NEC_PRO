package LTI.part4;

import java.util.Scanner;

public class MinDigitSets 
{
    public static int minSets(String s, int Y) 
    {
        int count = 0, i = 0, n = s.length();
        while (i < n) 
        {
            long num = 0;
            int j = i;
            while (j < n && (num * 10 + (s.charAt(j) - '0')) <= Y) 
            {
                num = num * 10 + (s.charAt(j) - '0');
                j++;
            }
            if (i == j) return -1; // current digit > Y
            i = j;
            count++;
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int Y = sc.nextInt();
        System.out.println(minSets(s, Y));
        sc.close();
    }
}
// 1234
// 30
// 3