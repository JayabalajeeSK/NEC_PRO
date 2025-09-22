package LTI.part3;

import java.util.Scanner;

public class NavigateGrid 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        int x = sc.nextInt(); 
        int y = sc.nextInt();
        sc.close();

        long[][] dp = new long[n + 1][m + 1];

        dp[1][1] = 1;

        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= m; j++) 
            {
    
                if (i == x && j == y) 
                {
                    dp[i][j] = 0;
                    continue;
                }
                if (i > 1) dp[i][j] = dp[i][j] + dp[i - 1][j]; 
                if (j > 1) dp[i][j] = dp[i][j] + dp[i][j - 1]; 
            }
        }


        System.out.println(dp[n][m]);
    }
}
// 2
// 2
// 2
// 1
// 1