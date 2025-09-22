package LTI.part3;

import java.util.Scanner;

public class CashBack 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 1, b = 1;

        for (int i = 2; i < n; i++) 
        {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);

        sc.close();
    }
}
// Enter number of terms: 8
// 21