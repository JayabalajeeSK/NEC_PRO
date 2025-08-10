package CollectionsTopic.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListAllMethods 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Read size and elements of array
        // Example input:
        // 5
        // 10 20 30 40 50
        int n = scanner.nextInt();
        Integer[] array = new Integer[n];

        for (int i = 0; i < n; i++) 
        {
            array[i] = scanner.nextInt();
        }

        // Convert array to ArrayList
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));

        // Output: Original list
        System.out.println("Original List: " + list);

        // 1. Add element at end
        list.add(60); // Output: [10, 20, 30, 40, 50, 60]
        System.out.println("After add(60): " + list);

        // 2. Add element at index
        list.add(2, 25); // Output: [10, 20, 25, 30, 40, 50, 60]
        System.out.println("After add(2, 25): " + list);

        // 3. Add all from another list
        ArrayList<Integer> anotherList = new ArrayList<>();
        anotherList.add(70);
        anotherList.add(80);
        list.addAll(anotherList); // Output: [..., 70, 80]
        System.out.println("After addAll(anotherList): " + list);

        // 4. Get element at index
        System.out.println("Element at index 3: " + list.get(3)); // Output: 30

        // 5. Set element at index
        list.set(0, 99); // Output: [99, 20, ...]
        System.out.println("After set(0, 99): " + list);

        // 6. Remove by index
        list.remove(1); // Removes element at index 1
        System.out.println("After remove(1): " + list);

        // 7. Remove by value
        list.remove(Integer.valueOf(50)); // Removes value 50
        System.out.println("After remove(Integer.valueOf(50)): " + list);

        // 8. Contains
        System.out.println("Contains 30? " + list.contains(30)); // true

        // 9. Index of
        System.out.println("Index of 60: " + list.indexOf(60)); // e.g. 5

        // 10. Size
        System.out.println("Size of list: " + list.size());

        // 11. isEmpty
        System.out.println("Is list empty? " + list.isEmpty()); // false

        // 12. Clear list
        list.clear();
        System.out.println("After clear(): " + list); // []

        // 13. isEmpty again
        System.out.println("Is list empty now? " + list.isEmpty()); // true

        scanner.close();
    }
}
// 5
// 10 20 30 40 50
// Original List: [10, 20, 30, 40, 50]

// After add(60): [10, 20, 30, 40, 50, 60]

// After add(2, 25): [10, 20, 25, 30, 40, 50, 60]

// After addAll(anotherList): [10, 20, 25, 30, 40, 50, 60, 70, 80]

// Element at index 3: 30

// After set(0, 99): [99, 20, 25, 30, 40, 50, 60, 70, 80]

// After remove(1): [99, 25, 30, 40, 50, 60, 70, 80]

// After remove(Integer.valueOf(50)): [99, 25, 30, 40, 60, 70, 80]

// Contains 30? true

// Index of 60: 4

// Size of list: 7

// Is list empty? false

// After clear(): []

// Is list empty now? true