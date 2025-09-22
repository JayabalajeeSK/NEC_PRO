package LTI.part3;

import java.util.*;

public class SodaCups 
{
    public static int cups(int[] capacities, int L) 
    {
        int low = 0, high = Arrays.stream(capacities).max().getAsInt();
        int result = -1;
        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            long total = 0;
            for (int cap : capacities) 
            {
                total = total +  Math.min(mid, cap);
            }
            if (total >= L) 
            {
                result = mid;
                high = mid - 1; 
            } 
            else 
            {
                low = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] capacities = new int[N];


        for (int i = 0; i < N; i++) 
        {
            capacities[i] = sc.nextInt();
        }

        int L = sc.nextInt();

        int minM = cups(capacities, L);
        System.out.println(minM);

        sc.close();
    }
}
// 5
// 2 3 4 5 6
// 15
// 4