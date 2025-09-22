package LTI.part4;

import java.util.*;

public class OddEvenArranger 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        sc.close();

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for (int num : arr) 
        {
            if (num % 2 == 0) 
            {
                even.add(num);
            } 
            else 
            {
                odd.add(num);
            }
        }

        if (odd.size() != even.size()) 
        {
            System.out.println("Invalid input: Number of odd and even elements must be equal.");
            return;
        }

        Collections.sort(odd);
        Collections.sort(even);

        boolean evenFirst = Math.min(Collections.min(odd), Collections.min(even)) % 2 == 0;

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < odd.size(); i++) 
        {
            if (evenFirst) 
            {
                result.add(even.get(i));
                result.add(odd.get(i));
            } 
            else 
            {
                result.add(odd.get(i));
                result.add(even.get(i));
            }
        }

        System.out.println("Output:");
        for (int num : result) 
        {
            System.out.print(num + " ");
        }
    }
}
// Enter number of elements: 6
// Enter array elements:
// 9 8 13 2 19 14
// Output:
// 2 9 8 13 14 19 