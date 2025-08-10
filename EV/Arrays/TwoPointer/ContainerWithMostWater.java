package EV.Arrays.TwoPointer;

import java.util.Scanner;

public class ContainerWithMostWater 
{
    // Function to calculate maximum area
    public int maxArea(int[] wallHeight) 
    {
        int left = 0;
        int right = wallHeight.length - 1;
        int max = -1;

        while (left < right) 
        {
            int w = right - left;
            int h = Math.min(wallHeight[left], wallHeight[right]);
            max = Math.max(max, w * h);

            if (wallHeight[left] < wallHeight[right]) 
            {
                left++;
            } 
            else 
            {
                right--;
            }
        }
        return max;
    }

    // Main method to test the function
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read number of vertical lines and their heights
        // Example input:
        // 9
        // 1 8 6 2 5 4 8 3 7
        int n = scanner.nextInt(); // number of lines
        int[] wallHeight = new int[n];

        for (int i = 0; i < n; i++) 
        {
            wallHeight[i] = scanner.nextInt();
        }

        ContainerWithMostWater max = new ContainerWithMostWater();
        int result = max.maxArea(wallHeight);

        // Output the result
        System.out.println("Maximum water that can be contained: " + result);

        scanner.close();
    }
}
// 9 
// 1 8 6 2 5 4 8 3 7
// Maximum water that can be contained: 49
