package CollectionsTopic.Set;

import java.util.*;

public class SetOperations 
{
    public static void main(String[] args) 
    {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));

        // Union
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);  // [1, 2, 3, 4, 5, 6, 7, 8]

        // Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);  // [4, 5]

        // Difference (set1 - set2)
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference (set1 - set2): " + difference);  // [1, 2, 3]
    }
}
// Union: [1, 2, 3, 4, 5, 6, 7, 8]
// Intersection: [4, 5]
// Difference (set1 - set2): [1, 2, 3]