package CollectionsTopic.List;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Arrays;

public class LinkedListAllMethods 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read number of elements and the array
        // Example input:
        // 5
        // 10 20 30 40 50
        int n = scanner.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }

        // Convert array to LinkedList
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(arr));
        System.out.println("Original List: " + list);

        // 1. Add element at end
        list.add(60); // Output: [10, 20, 30, 40, 50, 60]
        System.out.println("After add(60): " + list);

        // 2. Add element at specific index
        list.add(2, 25); // Output: [10, 20, 25, 30, ...]
        System.out.println("After add(2, 25): " + list);

        // 3. Add first and last
        list.addFirst(5);
        list.addLast(70);
        System.out.println("After addFirst(5) and addLast(70): " + list);

        // 4. Get elements
        System.out.println("Element at index 3: " + list.get(3));       // 30
        System.out.println("First element: " + list.getFirst());        // 5
        System.out.println("Last element: " + list.getLast());          // 70

        // 5. Set element at index
        list.set(0, 99); // Change first element to 99
        System.out.println("After set(0, 99): " + list);

        // 6. Remove by index and value
        list.remove(1); // Remove element at index 1
        list.remove(Integer.valueOf(50)); // Remove value 50
        System.out.println("After remove(1) and remove(50): " + list);

        // 7. Remove first and last
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst() and removeLast(): " + list);

        // 8. Contains and IndexOf
        System.out.println("Contains 30? " + list.contains(30));      // true/false
        System.out.println("Index of 60: " + list.indexOf(60));       // Index if exists

        // 9. Size and isEmpty
        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());

        // 10. Clear the list
        list.clear();
        System.out.println("After clear(): " + list);                 // []

        // 11. Check empty again
        System.out.println("Is list empty now? " + list.isEmpty());   // true

        scanner.close();
    }
}

// 5
// 10 20 30 40 50
// Original List: [10, 20, 30, 40, 50]

// After add(60): [10, 20, 30, 40, 50, 60]

// After add(2, 25): [10, 20, 25, 30, 40, 50, 60]

// After addFirst(5) and addLast(70): [5, 10, 20, 25, 30, 40, 50, 60, 70]

// Element at index 3: 25

// First element: 5
// Last element: 70

// After set(0, 99): [99, 10, 20, 25, 30, 40, 50, 60, 70]

// After remove(1) and remove(50): [99, 20, 25, 30, 40, 60, 70]

// After removeFirst() and removeLast(): [20, 25, 30, 40, 60]

// Contains 30? true

// Index of 60: 4

// Size of list: 5

// Is list empty? false

// After clear(): []

// Is list empty now? true