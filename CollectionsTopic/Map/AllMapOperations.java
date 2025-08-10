package CollectionsTopic.Map;

import java.util.*;

public class AllMapOperations 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input for 3 arrays (used as key-value pairs)
        System.out.print("Enter number of entries (key-value pairs): ");
        int n = scanner.nextInt();

        int[] keys1 = new int[n]; // for HashMap
        int[] values1 = new int[n];

        int[] keys2 = new int[n]; // for TreeMap
        int[] values2 = new int[n];

        int[] keys3 = new int[n]; // for LinkedHashMap
        int[] values3 = new int[n];

        // Input for HashMap
        System.out.println("\nEnter " + n + " key-value pairs for HashMap:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Key: ");
            keys1[i] = scanner.nextInt();

            System.out.print("Value: ");
            values1[i] = scanner.nextInt();
        }

        // Input for TreeMap
        System.out.println("\nEnter " + n + " key-value pairs for TreeMap:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Key: ");
            keys2[i] = scanner.nextInt();

            System.out.print("Value: ");
            values2[i] = scanner.nextInt();
        }

        // Input for LinkedHashMap
        System.out.println("\nEnter " + n + " key-value pairs for LinkedHashMap:");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Key: ");
            keys3[i] = scanner.nextInt();

            System.out.print("Value: ");
            values3[i] = scanner.nextInt();
        }

        // Initialize all maps
        Map<Integer, Integer> hashMap = new HashMap<>();
        Map<Integer, Integer> treeMap = new TreeMap<>();
        Map<Integer, Integer> linkedMap = new LinkedHashMap<>();

        // ----------- put() method -----------
        for (int i = 0; i < n; i++) 
        {
            hashMap.put(keys1[i], values1[i]);
            treeMap.put(keys2[i], values2[i]);
            linkedMap.put(keys3[i], values3[i]);
        }

        // Display all maps
        System.out.println("\nHashMap: " + hashMap);
        System.out.println("TreeMap: " + treeMap);
        System.out.println("LinkedHashMap: " + linkedMap);

        // ----------- putAll() method -----------
        Map<Integer, Integer> combinedMap = new HashMap<>();
        combinedMap.putAll(hashMap);
        combinedMap.putAll(treeMap);
        combinedMap.putAll(linkedMap);
        System.out.println("\nCombinedMap after putAll(): " + combinedMap);

        // ----------- get() method -----------
        System.out.print("\nEnter key to get value from combinedMap: ");
        int keyToGet = scanner.nextInt();
        System.out.println("Value for key " + keyToGet + ": " + combinedMap.get(keyToGet));

        // ----------- containsKey() & containsValue() -----------
        System.out.print("Enter key to check: ");
        int checkKey = scanner.nextInt();
        System.out.println("Contains key " + checkKey + "? " + combinedMap.containsKey(checkKey));

        System.out.print("Enter value to check: ");
        int checkValue = scanner.nextInt();
        System.out.println("Contains value " + checkValue + "? " + combinedMap.containsValue(checkValue));

        // ----------- remove() method -----------
        System.out.print("Enter key to remove: ");
        int removeKey = scanner.nextInt();
        combinedMap.remove(removeKey);
        System.out.println("After remove(" + removeKey + "): " + combinedMap);

        // ----------- keySet(), values(), entrySet() -----------
        System.out.println("All Keys: " + combinedMap.keySet());
        System.out.println("All Values: " + combinedMap.values());
        System.out.println("All Entries:");
        for (Map.Entry<Integer, Integer> entry : combinedMap.entrySet()) 
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // ----------- size(), isEmpty() -----------
        System.out.println("Size of combinedMap: " + combinedMap.size());
        System.out.println("Is combinedMap empty? " + combinedMap.isEmpty());

        // ----------- clear() -----------
        combinedMap.clear();
        System.out.println("After clear(): " + combinedMap);
        System.out.println("Is combinedMap empty now? " + combinedMap.isEmpty());

        scanner.close();
    }
}
// sample input
// Enter number of entries (key-value pairs): 3
// 10 100
// 20 200
// 30 300
// 11 111
// 22 222
// 33 333

// HashMap: {20=200, 10=100, 30=300}
// TreeMap: {11=111, 22=222, 33=333}
// LinkedHashMap: {44=444, 55=555, 66=666}

// CombinedMap after putAll(): {33=333, 66=666, 20=200, 22=222, 55=555, 10=100, 11=111, 44=444, 30=300}

// Enter key to get value from combinedMap: 30
// Value for key 30: 300
// Enter key to check: 222
// Contains key 222? false
// Enter value to check: 33
// Contains value 33? false
// Enter key to remove: 33
// After remove(33): {66=666, 20=200, 22=222, 55=555, 10=100, 11=111, 44=444, 30=300}
// All Keys: [66, 20, 22, 55, 10, 11, 44, 30]
// All Values: [666, 200, 222, 555, 100, 111, 444, 300]
// All Entries:
// Key: 66, Value: 666
// Key: 20, Value: 200
// Key: 22, Value: 222
// Key: 55, Value: 555
// Key: 10, Value: 100
// Key: 11, Value: 111
// Key: 44, Value: 444
// Key: 30, Value: 300
// Size of combinedMap: 8
// Is combinedMap empty? false
// After clear(): {}
// Is combinedMap empty now? true