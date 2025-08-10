package JB;

import java.util.Scanner;

public class CountSetBitsComparison 
{

    // 🔹 Method 1: Right Shift + Bitwise AND
    public static int countSetBitsRightShift(int n) 
    {
        int count = 0;
        while (n > 0) 
        {
            count = count + (n & 1);
            n >>= 1;
        }
        return count;
    }

    // 🔹 Method 2: Brian Kernighan's Algorithm
    public static int countSetBitsKernighan(int n) 
    {
        int count = 0;
        while (n > 0) 
        {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example input: 13
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Store the original value for display
        int original = n;

        // Call both methods
        int result1 = countSetBitsRightShift(n);
        int result2 = countSetBitsKernighan(n);

        // Output both results
        System.out.println("\n--- Count Set Bits ---");
        System.out.println("Input number: " + original);
        System.out.println("Method 1 (Right Shift): " + result1);
        System.out.println("Method 2 (Kernighan): " + result2);

        scanner.close();
    }
}
// --- Count Set Bits ---
// Input number: 13
// Method 1 (Right Shift): 3
// Method 2 (Kernighan): 3