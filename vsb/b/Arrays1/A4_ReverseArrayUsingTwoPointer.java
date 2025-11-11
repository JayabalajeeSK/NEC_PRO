package vsb.b.Arrays1;

import java.util.Scanner;

public class A4_ReverseArrayUsingTwoPointer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }
    
        int left = 0, right = arr.length - 1;

        while (left < right) 
        {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int num : arr) 
        {
            System.out.print(num + " ");
        }
        scanner.close();
    }

}
// 10
// 20 30 40 50 60 70 80 90 100 199
// 199 100 90 80 70 60 50 40 30 20

// 5
// 10 20 30 40 50
// 50 40 30 20 10