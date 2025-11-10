package Zoho.Round_2;

import java.util.*;

public class Z3B_AlternateSort {

    public static void alternateSortInPlace(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);

        int maxElem = arr[n - 1] + 1;

        int minIdx = 0;
        int maxIdx = n - 1;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) 
            {
         
                arr[i] += (arr[maxIdx] % maxElem) * maxElem;
                maxIdx--;
            } 
            else 
            {
             
                arr[i] += (arr[minIdx] % maxElem) * maxElem;
                minIdx++;
            }
        }

       
        for (int i = 0; i < n; i++) 
        {
            arr[i] = arr[i] / maxElem;
        }
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
        sc.close();
k
        alternateSortInPlace(arr);

        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
    }
}
// 7
// 1 2 3 4 5 6 7
// 7 1 6 2 5 3 4

// 9
// 23 7 8 30 18 12 6 28 16
// 30 6 28 7 23 8 18 12 16