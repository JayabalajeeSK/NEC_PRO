package Zoho.Round_2;

import java.util.Scanner;

public class Z4_ArrayThresholdCount 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int threshold = sc.nextInt();
        sc.close();

        int totalCount = 0;

        for (int num : arr) 
        {
            int count = num / threshold;
            if (num % threshold != 0) 
            {
                count = count + 1;
            }
            totalCount = totalCount + count;
        }

        // Display the result
        System.out.println(totalCount);
    }
}
// 6
// 5 8 10 13 6 2 
// 3
// 17

// 10
// 489 853 843 835 895 89 24 8953 853 8935
// 853
// 31