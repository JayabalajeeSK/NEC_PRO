package LTI.part5;

import java.util.*;

public class ProductArrayExceptSelf 
{

    public static int[] productExceptSelf(int[] numbers) 
    {
        int n = numbers.length;
        int[] result = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) 
        {
            result[i] = result[i - 1] * numbers[i - 1];
        }

        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) 
        {
            result[i] = result[i] * suffixProduct;
            suffixProduct = suffixProduct * numbers[i];
        }

        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            numbers[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(numbers);

        System.out.println("Product array except self:");
        for (int val : result) 
        {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
// Enter number of elements: 4
// Enter array elements:
// 1 2 3 4
// Product array except self:
// 24 12 8 6 