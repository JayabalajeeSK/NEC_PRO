// package vsb.b.Arrays1;

// import java.util.*;

// public class ArrayToArrayList {


//     // Function to convert array → ArrayList
//     static ArrayList<Integer> convertToArrayList(int[] arr) {
//         ArrayList<Integer> list = new ArrayList<>();
//         for (int val : arr) {
//             list.add(val);
//         }
//         return list;
//     }

//     // Function to display ArrayList
//     static void displayList(ArrayList<Integer> list) {
//         System.out.println("ArrayList elements: " + list);
//     }

//     // Function to add element at last
//     static void addAtLast(ArrayList<Integer> list, int value) {
//         list.add(value);
//         System.out.println("After adding " + value + " at last: " + list);
//     }

//     // Function to add element at particular position
//     static void addAtPosition(ArrayList<Integer> list, int index, int value) {
//         if (index >= 0 && index <= list.size()) {
//             list.add(index, value);
//             System.out.println("After adding " + value + " at index " + index + ": " + list);
//         } else {
//             System.out.println("Invalid index!");
//         }
//     }

//     // Function to remove element at particular position
//     static void removeAtPosition(ArrayList<Integer> list, int index) {
//         if (index >= 0 && index < list.size()) {
//             int removed = list.remove(index);
//             System.out.println("Removed element " + removed + " from index " + index + ": " + list);
//         } else {
//             System.out.println("Invalid index!");
//         }
//     }

//     // Function to remove element by value
//     static void removeByValue(ArrayList<Integer> list, int value) {
//         if (list.remove(Integer.valueOf(value))) {
//             System.out.println("Removed value " + value + ": " + list);
//         } else {
//             System.out.println("Value not found!");
//         }
//     }

//     // MAIN
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter array size: ");
//         int n = sc.nextInt();

//         int[] arr = getArrayValues(n);
//         ArrayList<Integer> list = convertToArrayList(arr);
//         displayList(list);

//         // Example operations:
//         System.out.print("Enter value to add at last: ");
//         int valLast = sc.nextInt();
//         addAtLast(list, valLast);

//         System.out.print("Enter index and value to insert: ");
//         int index = sc.nextInt();
//         int valPos = sc.nextInt();
//         addAtPosition(list, index, valPos);

//         System.out.print("Enter index to remove element: ");
//         int remIndex = sc.nextInt();
//         removeAtPosition(list, remIndex);

//         System.out.print("Enter value to remove: ");
//         int remVal = sc.nextInt();
//         removeByValue(list, remVal);

//         System.out.println("Final ArrayList: " + list);
//     }
// }
