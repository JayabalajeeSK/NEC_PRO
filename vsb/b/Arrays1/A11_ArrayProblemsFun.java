package vsb.b.Arrays1;

import java.util.*;

public class A11_ArrayProblemsFun extends A10_Dynamic_1DArray_Fun
{
    // 1 Linear Search
    static int linearSearch(int[] arr, int target) 
    {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == target) return i;
        }
        return -1; 
    }

    // 2.  binary serach
    static int binarySearch(int[] arr, int target) 
    {
        int low = 0, high = arr.length - 1;
        Arrays.sort(arr);
        displayArrayNormal(arr);

        while (low <= high) 
        {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;

            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // 3. Pair Sum
    static void findPairs(int[] arr, int target) 
    {
        System.out.println("Pairs with sum " + target + ":");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] + arr[j] == target) System.out.println("(" + arr[i] + ", " + arr[j] + ")");
            }
        }
    }

    // 4. Second Max
    static int secondMax(int[] arr) 
    {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int val : arr) 
        {
            if (val > first) 
            {
                second = first;
                first = val;
            } 
            else if (val > second && val != first) 
            {
                second = val;
            }
        }
        return second;
    }

    // 5. Nth Min and Max
    static int nthMax(int[] arr, int n) 
    {
        Arrays.sort(arr); 
        return arr[arr.length - n]; 
    }

    
    static int nthMin(int[] arr, int n) 
    {
        Arrays.sort(arr); 
        return arr[n - 1]; 
    }


    //6. Reverse array - 2 pointer
    static void reverseArray(int[] arr) 
    {
        int left = 0, right = arr.length - 1;

        while (left < right) 
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        displayArrayEnhanced(arr);
    }

    // 7. check sorted
    static boolean isSortedAsc(int[] arr) 
    {
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    static boolean isSortedDesc(int[] arr) 
    {
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > arr[i - 1]) return false;
        }
        return true;
    }

    // 8. Move Zeros
    static void moveZeros(int[] arr) 
    {
        int index = 0;
        for (int val : arr) 
        {
            if (val != 0) 
            {
                arr[index] = val;
                index++;
            }
        }
        while (index > arr.length) 
        {
            arr[index] = 0;
            index++;
        }
        displayArrayEnhanced(arr);
    } 

    //9. range reverse and rotate helper method
    static void reverse(int[] arr, int start, int end) 
    {
        while (start < end) 
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    
    static void rotateRight(int[] arr, int k) 
    {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    static void rotateLeft(int[] arr, int k) 
    {
        k = k % arr.length;
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    
    static int binarySearchWithDuplicates(int[] arr, int target) 
    {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) 
        {
            int mid = (low + high) / 2;

            if (arr[mid] == target) 
            {
                result = mid;
                high = mid - 1; 
            } 
            
            else if (arr[mid] < target) low = mid + 1;

            else high = mid - 1;
        }
        return result;
    }


    static int[] productExceptSelf(int[] arr) 
    {
        int n = arr.length;
        int[] output = new int[n];
        int left = 1, right = 1;

        for (int i = 0; i < n; i++) 
        {
            output[i] = left;
            left *= arr[i];
        }

        for (int i = n - 1; i >= 0; i--) 
        {
            output[i] *= right;
            right *= arr[i];
        }

        return output;
    }

    static void bubbleSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
        {
            for (int j = 0; j < n - 1 - i; j++) 
            {
                if (arr[j] > arr[j + 1]) 
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static int missingNumberFormula(int[] arr, int n) 
    {
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int val : arr)
            sum = sum + val;
        return total - sum;
    }

    static int missingNumberWithoutFormula(int[] arr, int n) 
    {
        boolean[] present = new boolean[n + 1];
        for (int val : arr)
            present[val] = true;

        for (int i = 1; i <= n; i++) 
        {
            if (!present[i])
                return i;
        }
        return -1;
    }

}