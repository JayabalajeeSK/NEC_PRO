package CollectionsTopic.Queue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueAllOps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Example Input:
        // 5
        // 10 30 20 45 34
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) 
        {
            pq.add(scanner.nextInt()); // add elements to the priority queue
        }

        // Current priority queue (heap structure)
        System.out.println("Initial PriorityQueue: " + pq); // not sorted, but smallest is always at the head

        // offer()
        pq.offer(50);
        System.out.println("After offer(50): " + pq);

        // peek()
        System.out.println("Peek (smallest element): " + pq.peek());

        // poll()
        System.out.println("Poll (removed head): " + pq.poll());
        System.out.println("After poll(): " + pq);

        // remove()
        pq.remove(); // removes current head
        System.out.println("After remove(): " + pq);

        // remove specific value
        pq.remove(Integer.valueOf(30));
        System.out.println("After remove(30): " + pq);

        // contains()
        System.out.print("Enter value to search: ");
        int search = scanner.nextInt(); // e.g., 20
        System.out.println("Contains " + search + "? " + pq.contains(search));

        // size()
        System.out.println("Size: " + pq.size());

        // isEmpty()
        System.out.println("Is queue empty? " + pq.isEmpty());

        // clear()
        pq.clear();
        System.out.println("After clear(): " + pq);
        System.out.println("Is queue empty now? " + pq.isEmpty());

        scanner.close();
    }
}
// Enter number of elements: 5
// Enter 5 elements:
// 10 30 20 45 34

// Initial PriorityQueue: [10, 30, 20, 45, 34]

// After offer(50): [10, 30, 20, 45, 34, 50]

// Peek (smallest element): 10

// Poll (removed head): 10

// After poll(): [20, 30, 50, 45, 34]

// After remove(): [30, 34, 50, 45]

// After remove(30): [34, 45, 50]

// Enter value to search: 45
// Contains 45? true

// Size: 3

// Is queue empty? false

// After clear(): []

// Is queue empty now? true