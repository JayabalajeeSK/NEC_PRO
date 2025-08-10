package CollectionsTopic.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueAllMethods 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        // Example input:
        // 5
        // 10 20 30 40 50
        int n = scanner.nextInt(); // number of elements to add
        for (int i = 0; i < n; i++) 
        {
            queue.add(scanner.nextInt());
        }

        // Print the original queue
        System.out.println("Initial Queue: " + queue); // [10, 20, 30, 40, 50]

        // 1. offer - add element safely (returns true/false)
        boolean offerSuccess = queue.offer(60);
        System.out.println("After offer(60): " + queue); // [10, ..., 60]
        System.out.println("Offer success: " + offerSuccess); // true

        // 2. add - add element (throws exception if full)
        queue.add(70);
        System.out.println("After add(70): " + queue); // [10, ..., 70]

        // 3. peek - view front element
        System.out.println("Front element (peek): " + queue.peek()); // 10

        // 4. poll - remove and return front element
        int polled = queue.poll(); // removes 10
        System.out.println("Element polled: " + polled);
        System.out.println("Queue after poll(): " + queue); // [20, 30, ...]

        // 5. remove - remove front element (throws exception if empty)
        int removed = queue.remove(); // removes 20
        System.out.println("Element removed: " + removed);
        System.out.println("Queue after remove(): " + queue); // [30, 40, ...]

        // 6. contains - check if value exists
        int searchValue = scanner.nextInt(); // Example: 40
        System.out.println("Contains " + searchValue + "? " + queue.contains(searchValue));

        // 7. size - number of elements
        System.out.println("Queue size: " + queue.size());

        // 8. isEmpty - check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty());

        // 9. clear - remove all elements
        queue.clear();
        System.out.println("After clear(): " + queue); // []

        // 10. isEmpty again
        System.out.println("Is queue empty now? " + queue.isEmpty()); // true

        scanner.close();
    }
}
// 5
// 10 20 30 40 50

// Initial Queue: [10, 20, 30, 40, 50]

// After offer(60): [10, 20, 30, 40, 50, 60]

// Offer success: true

// After add(70): [10, 20, 30, 40, 50, 60, 70]

// Front element (peek): 10

// Element polled: 10

// Queue after poll(): [20, 30, 40, 50, 60, 70]

// Element removed: 20

// Queue after remove(): [30, 40, 50, 60, 70]
