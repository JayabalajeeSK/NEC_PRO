package LTI.part5;

import java.util.*;

public class SetOperationsDistinct 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.print("Enter elements of first array: ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] b = new int[m];

        System.out.print("Enter elements of second array: ");
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();

        sc.close();

        Set<Integer> setA = new HashSet<>();
        for (int x : a) setA.add(x);

        Set<Integer> setB = new HashSet<>();
        for (int x : b) setB.add(x);

        // Union
        Set<Integer> unionSet = new HashSet<>(setA);
        unionSet.addAll(setB);

        // Intersection
        Set<Integer> intersectionSet = new HashSet<>(setA);
        intersectionSet.retainAll(setB);

        // Difference (A - B)
        Set<Integer> differenceSet = new HashSet<>(unionSet);
        differenceSet.removeAll(intersectionSet);

        System.out.print("Union: ");
        for (int num : unionSet) System.out.print(num + " ");
        System.out.println();

        System.out.print("Intersection: ");
        for (int num : intersectionSet) System.out.print(num + " ");
        System.out.println();

        System.out.print("Difference (A - B): ");
        for (int num : differenceSet) System.out.print(num + " ");
        System.out.println();

        System.out.println(differenceSet.size());
    }
}
// Enter size of first array: 5
// Enter elements of first array: 1 3 5 6 8
// Enter size of second array: 6
// Enter elements of second array: 1 2 3 5 9 6
// Union: 1 2 3 5 6 8 9
// Intersection: 1 3 5 6
// Difference (A - B): 2 8 9
// 3