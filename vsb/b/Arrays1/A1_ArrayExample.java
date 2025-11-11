package vsb.b.Arrays1;

public class A1_ArrayExample 
{
    public static void main(String[] args) 
    {
        int[] numbers = new int[5]; 
        int[] numbersA = new int[]{11, 22, 33, 44, 55};
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        System.out.println();

        for (int i = 0; i < numbersA.length; i++)
        {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        System.out.println();

        String[] names = new String[] {"Apple", "Banana", "Cherry", "Dates", "Elderberry"};
        names[0] = "One";
        names[1] = "Two";
        names[2] = "Three";
        names[3] = "Four";
        names[4] = "Five";

        for (int i = 0; i < names.length; i++)
        {
            System.out.println("Element at index " + i + ": " + names[i]);
        }

    }
}
// Element at index 0: 10
// Element at index 1: 20
// Element at index 2: 30
// Element at index 3: 40
// Element at index 4: 50
// Element at index 0: 10
// Element at index 1: 20
// Element at index 2: 30
// Element at index 3: 40
// Element at index 4: 50
// Element at index 0: One
// Element at index 1: Two
// Element at index 2: Three
// Element at index 3: Four
// Element at index 4: Five