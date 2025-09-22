package LTI.part4;

import java.util.*;

public class VowelLCS 
{
    public static int vowelLCS(String s1, String s2) 
    {
        // Step 1: Extract vowels (regex for s1, char for s2)
        String v1 = s1.replaceAll("[^aeiouAEIOU]", "");
        StringBuilder sb = new StringBuilder();
        String vowels = "aeiouAEIOU";
        for (char c : s2.toCharArray()) 
        {
            if (vowels.indexOf(c) != -1) sb.append(c);
        }
        String v2 = sb.toString();

        int n = v1.length(), m = v2.length();
        int[][] dp = new int[n + 1][m + 1];

        // Step 2: Fill DP and print each step
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= m; j++) 
            {
                if (v1.charAt(i - 1) == v2.charAt(j - 1)) 
                {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } 
                else 
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }

            // Print DP table after each row update
            System.out.println("After processing v1[" + i + "] = " + v1.charAt(i - 1));
            for (int x = 0; x <= n; x++) 
            {
                for (int y = 0; y <= m; y++) 
                {
                    System.out.print(dp[x][y] + " ");
                }
                System.out.println();
            }
            System.out.println("------------------");
        }

        return dp[n][m];
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine(); // vowelpunish
        String str2 = sc.nextLine(); // english
        sc.close();

        int ans = vowelLCS(str1, str2);
        System.out.println("LCS length (vowels only) = " + ans);
    }
}
// vowelpunish
// english
// After processing v1[1] = o
// 0 0 0 
// 0 0 0 
// 0 0 0
// 0 0 0
// 0 0 0
// ------------------
// After processing v1[2] = e
// 0 0 0
// 0 0 0
// 0 1 1
// 0 0 0
// 0 0 0
// ------------------
// After processing v1[3] = u
// 0 0 0
// 0 0 0
// 0 1 1
// 0 1 1
// 0 0 0
// ------------------
// After processing v1[4] = i
// 0 0 0 
// 0 0 0
// 0 1 1
// 0 1 1
// 0 1 2
// ------------------
// LCS length (vowels only) = 2