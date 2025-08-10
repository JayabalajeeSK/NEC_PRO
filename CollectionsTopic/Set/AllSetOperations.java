package CollectionsTopic.Set;

import java.util.*;

public class AllSetOperations 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Arrays to take input
        System.out.print("Enter number of elements for each array: ");
        int n = scanner.nextInt();

        int[] arr1 = new int[n]; // For HashSet
        int[] arr2 = new int[n]; // For TreeSet
        int[] arr3 = new int[n]; // For LinkedHashSet

        System.out.println("Enter " + n + " elements for Array 1 (HashSet):");
        for (int i = 0; i < n; i++) arr1[i] = scanner.nextInt();

        System.out.println("Enter " + n + " elements for Array 2 (TreeSet):");
        for (int i = 0; i < n; i++) arr2[i] = scanner.nextInt();

        System.out.println("Enter " + n + " elements for Array 3 (LinkedHashSet):");
        for (int i = 0; i < n; i++) arr3[i] = scanner.nextInt();

        // -------------------- Set Initialization ----------------------
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedSet = new LinkedHashSet<>();

        // -------------------- add() method ----------------------
        for (int val : arr1) hashSet.add(val);
        for (int val : arr2) treeSet.add(val);
        for (int val : arr3) linkedSet.add(val);

        System.out.println("HashSet: " + hashSet);
        System.out.println("TreeSet: " + treeSet);
        System.out.println("LinkedHashSet: " + linkedSet);

        // -------------------- addAll() method ----------------------
        Set<Integer> resultSet = new HashSet<>();
        resultSet.addAll(hashSet);
        resultSet.addAll(treeSet);
        resultSet.addAll(linkedSet);
        System.out.println("\nUnion using addAll(): " + resultSet);

        // -------------------- remove() method ----------------------
        System.out.print("Enter element to remove from resultSet: ");
        int removeElement = scanner.nextInt();
        resultSet.remove(removeElement);
        System.out.println("After remove(" + removeElement + "): " + resultSet);

        // -------------------- contains() method ----------------------
        System.out.print("Enter element to check if present in resultSet: ");
        int checkElement = scanner.nextInt();
        System.out.println("Contains " + checkElement + "? " + resultSet.contains(checkElement));

        // -------------------- size(), isEmpty() ----------------------
        System.out.println("Size of resultSet: " + resultSet.size());
        System.out.println("Is resultSet empty? " + resultSet.isEmpty());

        // -------------------- iterator() ----------------------
        System.out.print("Iterating resultSet using iterator(): ");
        Iterator<Integer> it = resultSet.iterator();
        while (it.hasNext()) 
        {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // -------------------- clear() method ----------------------
        resultSet.clear();
        System.out.println("After clear(), resultSet: " + resultSet);
        System.out.println("Is resultSet empty now? " + resultSet.isEmpty());

        scanner.close();
    }
}
// Sample input
// 5
// 10 20 30 20 50
// 25 10 30 70 20
// 100 50 30 10 5
// 20
// 10


//Output:
// Enter number of elements for each array: 5

// Enter 5 elements for Array 1 (HashSet):
// 10 20 30 20 50

// Enter 5 elements for Array 2 (TreeSet):
// 25 10 30 70 20

// Enter 5 elements for Array 3 (LinkedHashSet):
// 100 50 30 10 5

// HashSet: [50, 20, 10, 30]
// TreeSet: [10, 20, 25, 30, 70]
// LinkedHashSet: [100, 50, 30, 10, 5]

// Union using addAll(): [50, 20, 100, 5, 70, 25, 10, 30]

// Enter element to remove from resultSet: 20

// After remove(20): [50, 100, 5, 70, 25, 10, 30]

// Enter element to check if present in resultSet: 10

// Contains 10? true

// Size of resultSet: 7

// Is resultSet empty? false

// Iterating resultSet using iterator(): 50 100 5 70 25 10 30

// After clear(), resultSet: []

// Is resultSet empty now? true