package CollectionsTopic.List;

import java.util.Scanner;
import java.util.Stack;

public class StackAllMethods 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        // Example input:
        // 5
        // 10 20 30 40 50
        // Push elements
        int n = scanner.nextInt(); // number of elements to push
        for (int i = 0; i < n; i++) 
        {
            int value = scanner.nextInt();
            stack.push(value);
        }
        System.out.println("Stack after push: " + stack); // [10, 20, 30, 40, 50]

        // Pop the top element
        if (!stack.isEmpty()) 
        {
            int popped = stack.pop();
            System.out.println("Popped element: " + popped); // 50
        }

        // Peek at top element
        if (!stack.isEmpty()) 
        {
            int top = stack.peek();
            System.out.println("Top element (peek): " + top); // 40
        }

        // Check if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        // Search for an element (1-based index from top)
        // Example input: 20
        int searchElement = scanner.nextInt(); 
        int position = stack.search(searchElement);
        if (position == -1) 
        {
            System.out.println(searchElement + " not found in the stack.");
        } 
        else 
        {
            System.out.println(searchElement + " is at position (from top): " + position);
        }

        // Final stack state
        System.out.println("Final stack: " + stack);

        scanner.close();
    }
}

// 5
// 10 20 30 40 50

// Stack after push: [10, 20, 30, 40, 50]

// Popped element: 50

// Top element (peek): 40

// Is stack empty? false