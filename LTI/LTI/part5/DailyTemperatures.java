package LTI.part5;

import java.util.*;

public class DailyTemperatures 
{
    public static int[] dailyTemperatures(int[] temps) 
    {
        int[] results = new int[temps.length];
        Stack<Integer> stack = new Stack<>(); 

        for (int i = 0; i < temps.length; i++) 
        {
            while (!stack.isEmpty() && temps[stack.peek()] < temps[i]) 
            {
                results[stack.peek()] = i - stack.pop(); 
            }
            stack.push(i);
        }

        return results;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] temps = new int[n];

        System.out.println("Enter temperatures:");
        for (int i = 0; i < n; i++) 
        {
            temps[i] = sc.nextInt();
        }

        int[] result = dailyTemperatures(temps);

        System.out.println("Result:");
        for (int r : result) 
        {
            System.out.print(r + " ");
        }
        sc.close();
    }
}
// Enter number of days: 3
// Enter temperatures:
// 30 40 50
// Result:
// 1 1 0 