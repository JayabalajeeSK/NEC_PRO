package LTI.part4;

import java.util.*;

public class TicketCostMinimizer 
{
    public static String removeKDigits(String tickets, int k) 
    {
        Stack<Character> stack = new Stack<>();

        for (char c : tickets.toCharArray()) 
        {
            while (k > 0 && !stack.isEmpty() && stack.peek() > c) 
            {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        // Remove remaining digits if k > 0
        while (k > 0 && !stack.isEmpty()) 
        {
            stack.pop();
            k--;
        }

        // Build result
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') 
        {
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String tickets = sc.nextLine();
        int k = sc.nextInt();
        sc.close();

        System.out.println(removeKDigits(tickets, k));
    }
}
// 231
// 1
// 21