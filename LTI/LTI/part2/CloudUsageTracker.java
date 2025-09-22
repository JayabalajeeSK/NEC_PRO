package LTI.part2;

import java.util.*;

public class CloudUsageTracker 
{
    public static int getMaxKthUsage(int[] usages, int K, int M) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int usage : usages) 
        {
            pq.offer(usage);
        }

        for (int i = 0; i < M; i++) 
        {
            int minUsage = pq.poll();   
            pq.offer(minUsage + 1);     
        }

        List<Integer> list = new ArrayList<>(pq);
        Collections.sort(list);
        return list.get(K - 1);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of servers (N): ");
        int N = sc.nextInt();

        int[] usages = new int[N];
        System.out.println("Enter usages of servers:");
        for (int i = 0; i < N; i++) 
        {
            usages[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int K = sc.nextInt();

        System.out.print("Enter M: ");
        int M = sc.nextInt();

        int result = getMaxKthUsage(usages, K, M);
        System.out.println("Maximum possible K-th smallest usage: " + result);

        sc.close();
    }
}
// Enter number of servers (N): 5
// Enter usages of servers:
// 1 2 3 4 5
// Enter K: 3
// Enter M: 3
// Maximum possible K-th smallest usage: 3