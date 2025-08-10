package CollectionsTopic.Hashing;

import java.util.*;

class Student 
{
    String name;
    int age;

    public int hashCode() 
    {
        return (name.length() * 10) + age;
    }

    public String toString() 
    {
        return name + " (" + age + ")";
    }
}

public class CustomHashSimple 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HashSet<Student> set = new HashSet<>();

        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        int tableSize = 10; 

        for (int i = 0; i < n; i++) {
            Student s = new Student();

            System.out.print("Enter name: ");
            s.name = sc.nextLine();

            System.out.print("Enter age: ");
            s.age = sc.nextInt();
            sc.nextLine();

            set.add(s);
        }

        System.out.println("\nStudents with Custom Hash Code and Index:");
        for (Student s : set) 
        {
            int hash = s.hashCode();
            int index = Math.abs(hash % tableSize); 
            System.out.println(s + " -> Hash: " + hash + " -> Index: " + index);
        }

        sc.close();
    }
}
// Enter name: jaya
// Enter age: 25

// Students with Custom Hash Code and Index:
// jaya (25) -> Hash: 65 -> Index: 5
// tharun (24) -> Hash: 84 -> Index: 4
// jaya (22) -> Hash: 62 -> Index: 2
// bala (23) -> Hash: 63 -> Index: 3

// How many students? 3   
// Enter name: jaya
// Enter age: 22
// Enter name: bala
// Enter age: 23
// Enter name: jaya  
// Enter age: 22

// Students with Custom Hash Code and Index:
// jaya (22) -> Hash: 62 -> Index: 2
// jaya (22) -> Hash: 62 -> Index: 2
// bala (23) -> Hash: 63 -> Index: 3