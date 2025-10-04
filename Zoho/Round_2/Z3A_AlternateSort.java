package Zoho.Round_2;

import java.util.*;

public class Z3A_AlternateSort 
{
    public static ArrayList<Integer> alternateSort(int[] arr) 
    {
        int len = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        Arrays.sort(arr);  

        int i = 0;
        int j = len - 1;

        while (i < j) 
        {
            res.add(arr[j]); 
            res.add(arr[i]);  
            j--;
            i++;
        }

        if (i == j) 
        {
            res.add(arr[i]); 
        }
        return res;
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
        
        ArrayList<Integer> sortedList = alternateSort(arr);
        for (int num : sortedList) {
            System.out.print(num + " ");
        }
    }
}
// 9
// 23 7 8 30 18 12 6 28 16
// 30 6 28 7 23 8 18 12 16

// 7
// 1 2 3 4 5 6 7
// 7 1 6 2 5 3 4