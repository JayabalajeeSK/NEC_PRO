package CollectionsTopic.List;

import java.util.Scanner;
import java.util.Stack;

public class PrintReverseUsingStack {
    public void printReverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        // Push all elements into stack
        for (int num : arr) {
            stack.push(num);
        }

        // Pop and print elements in reverse order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example input:
        // 5
        // 1 2 3 4 5
        int n = scanner.nextInt(); // size of array
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        PrintReverseUsingStack obj = new PrintReverseUsingStack();
        obj.printReverseArray(arr); // Output: 5 4 3 2 1

        scanner.close();
    }
}
// 5
// 1 2 3 4 5
// 5 4 3 2 1