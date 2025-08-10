package EV2.Recursion;

import java.util.Scanner;

public class AllRecursionTypes 
{

    // 1. Tail Recursion
    public static void tailRecursion(int n) 
    {
        if (n == 0) 
        {
            return;
        }
        System.out.println("Tail: " + n);
        tailRecursion(n - 1);
    }

    // 2. Head Recursion
    public static void headRecursion(int n) 
    {
        if (n == 0) return;
        headRecursion(n - 1);
        System.out.println("Head: " + n);
    }

    // 3. Tree Recursion
    public static void treeRecursion(int n) 
    {
        if (n == 0) return;
        System.out.println("Tree: " + n);
        treeRecursion(n - 1);
        treeRecursion(n - 1);
    }

    // 4. Indirect Recursion
    public static void indirectA(int n) 
    {
        if (n <= 0) return;
        System.out.println("Indirect A: " + n);
        indirectB(n - 1);
    }

    public static void indirectB(int n) 
    {
        if (n <= 0) return;
        System.out.println("Indirect B: " + n);
        indirectA(n - 1);
    }

    // 5. Nested Recursion
    public static int nestedRecursion(int n) 
    {
        if (n > 100)
        {
            return n - 10;
        }    
        
        return nestedRecursion(nestedRecursion(n + 11));
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for demonstration (e.g., 3 or 5): ");
        int n = sc.nextInt();

        System.out.println("\n--- Tail Recursion ---");
        tailRecursion(n);

        System.out.println("\n--- Head Recursion ---");
        headRecursion(n);

        System.out.println("\n--- Tree Recursion ---");
        treeRecursion(n);

        System.out.println("\n--- Indirect Recursion ---");
        indirectA(n);

        System.out.println("\n--- Nested Recursion ---");
        int result = nestedRecursion(n);
        System.out.println("Nested Result: " + result);

        sc.close();
    }
}
// Enter a number for demonstration (e.g., 3 or 5): 3

// --- Tail Recursion ---
// Tail: 3
// Tail: 2
// Tail: 1

// --- Head Recursion ---
// Head: 1
// Head: 2
// Head: 3

// --- Tree Recursion ---
// Tree: 3
// Tree: 2
// Tree: 1
// Tree: 1
// Tree: 2
// Tree: 1
// Tree: 1

// --- Indirect Recursion ---
// Indirect A: 3
// Indirect B: 2
// Indirect A: 1

// --- Nested Recursion ---
// Nested Result: 91