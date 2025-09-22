package LTI.part3;

import java.util.Scanner;

public class NPrimeNumbers 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) 
        {
            boolean isPrime = true;

            for (int j = 2; j <= Math.sqrt(i); j++) 
            { 
                if (i % j == 0) 
                {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) 
            {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}

// Enter a number: 13
// 2 3 5 7 11 13