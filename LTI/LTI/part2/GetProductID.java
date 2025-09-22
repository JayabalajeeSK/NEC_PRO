package LTI.part2;

import java.util.Scanner;

public class GetProductID 
{
    public static int getCount(int[] arr, int id) 
    {
        int count = 0;
        for (int num : arr) 
        {
            if (num == id) 
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); 
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int id = sc.nextInt(); 
        System.out.println(getCount(arr, id));

        sc.close();
    }
}
// 17

// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 3
// 5
// 3
// 7
// 4
// 4
// 9
// 10
// 3

// 4

// 3