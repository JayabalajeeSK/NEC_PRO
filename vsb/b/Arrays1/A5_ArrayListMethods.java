package vsb.b.Arrays1;

import java.util.ArrayList;

public class A5_ArrayListMethods 
{
    public static void main(String[] args) 
    {
        // Create an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        // 1. add(element)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("After add(): " + fruits);

        // 2. add(index, element)
        fruits.add(1, "Orange");
        System.out.println("After add(index, element): " + fruits);

        // 3. get(index)
        System.out.println("get(2): " + fruits.get(2));

        // 4. set(index, element)
        fruits.set(2, "Grapes");
        System.out.println("After set(2, 'Grapes'): " + fruits);

        // 5. remove(index)
        fruits.remove(1);
        System.out.println("After remove(1): " + fruits);

        // 6. contains(element)
        System.out.println("Contains 'Mango': " + fruits.contains("Mango"));

        // 7. indexOf(element)
        System.out.println("Index of 'Mango': " + fruits.indexOf("Mango"));

        // 8. size()
        System.out.println("Size: " + fruits.size());

        // 9. isEmpty()
        System.out.println("Is Empty: " + fruits.isEmpty());

        // 10. clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits);

        // 11. isEmpty() again
        System.out.println("Is Empty after clear(): " + fruits.isEmpty());
    }
}
// After add(): [Apple, Banana, Mango]
// After add(index, element): [Apple, Orange, Banana, Mango]
// get(2): Banana
// After set(2, 'Grapes'): [Apple, Orange, Grapes, Mango]
// After remove(1): [Apple, Grapes, Mango]
// Contains 'Mango': true
// Index of 'Mango': 2
// Size: 3
// Is Empty: false
// After clear(): []
// Is Empty after clear(): true