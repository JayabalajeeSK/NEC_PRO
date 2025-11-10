package BackTrackingAndDP;


import java.util.Scanner;

public class PowerOfTwoCheck 
{
    public static boolean isPowerOfTwo(int n) 
    {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Example Input:
        // 16
        int n = scanner.nextInt();

        if (isPowerOfTwo(n)) System.out.println("Yes");
        else System.out.println("No");

        scanner.close();
    }
}
// 16
// Yes