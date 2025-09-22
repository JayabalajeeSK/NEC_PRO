package LTI.part2;

import java.util.*;

public class AbhijeetBookBudget 
{

    public static int minimumAmountToBorrow(int N, int[] earnArray, int[] costArray) 
    {
        int totalEarn = 0, totalCost = 0;
        for (int i = 0; i < N; i++) 
        {
            totalEarn = totalEarn + earnArray[i];
            totalCost = totalCost + costArray[i];
        }
        return Math.max(0, totalCost - totalEarn);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] earnArray = new int[N];
        for (int i = 0; i < N; i++) 
        {
            earnArray[i] = sc.nextInt();
        }

        int[] costArray = new int[N];
        for (int i = 0; i < N; i++) 
        {
            costArray[i] = sc.nextInt();
        }

        int result = minimumAmountToBorrow(N, earnArray, costArray);

        System.out.println(result);

        sc.close();
    }
}
// 3
// 3 4 2
// 5 3 4
// 3