package CollectionsTopic.Map;

import java.util.*;

public class MapIterationDemo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Input number of key-value pairs
        System.out.print("Enter number of entries: ");
        int n = scanner.nextInt();

        Map<Integer, String> map = new HashMap<>();

        // Input key-value pairs using Scanner
        System.out.println("Enter " + n + " key-value pairs (int key, string value):");
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Key: ");
            int key = scanner.nextInt();
            System.out.print("Value: ");
            String value = scanner.next();
            map.put(key, value);
        }

        System.out.println("\nOriginal Map: " + map);

        //  keySet() – iterate through all keys
        System.out.println(" Iterating using keySet():");
        for (Integer key : map.keySet()) 
        {
            System.out.println("Key = " + key);
        }

        // values() – iterate through all values
        System.out.println(" Iterating using values():");
        for (String value : map.values()) 
        {
            System.out.println("Value = " + value);
        }

        //  entrySet() – iterate through key-value pairs
        System.out.println(" Iterating using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) 
        {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        scanner.close();
    }
}
// Enter number of entries: 3

// Enter 3 key-value pairs (int key, string value):
// Key:  1   
// Value: bobby
// Key: 2
// Value: akash
// Key: 3
// Value: mat  

// Original Map: {1=bobby, 2=akash, 3=mat}

//  Iterating using keySet():
// Key = 1
// Key = 2
// Key = 3

//  Iterating using values():
// Value = bobby
// Value = akash
// Value = mat

//  Iterating using entrySet():
// Key = 1, Value = bobby
// Key = 2, Value = akash
// Key = 3, Value = mat