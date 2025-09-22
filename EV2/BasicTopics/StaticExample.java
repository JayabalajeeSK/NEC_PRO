package EV2.BasicTopics;

// Outer class
public class StaticExample 
{

    // Static variable (shared by all objects)
    static int count = 0;

    // Instance variable (different for each object)
    int id;

    // Constructor
    StaticExample(int id) 
    {
        this.id = id;
        count++; // increments static variable for every object
    }

    // Static method (can access only static variables directly)
    static void displayCount() 
    {
        System.out.println("Total objects created: " + count);
        // System.out.println(id); ❌ Can't access instance variables here
    }

    // Instance method (can access both static and instance variables)
    void displayInfo() 
    {
        System.out.println("Object ID: " + id + ", Count: " + count);
    }

    // Static nested class
    static class Helper 
    {
        static void message() 
        {
            System.out.println("Hello from static nested class!");
        }
    }

    // Main method
    public static void main(String[] args) 
    {
        StaticExample obj1 = new StaticExample(101);
        StaticExample obj2 = new StaticExample(102);

        // Accessing static method
        StaticExample.displayCount();

        // Accessing instance method
        obj1.displayInfo();
        obj2.displayInfo();

        // Accessing static nested class method
        StaticExample.Helper.message();
    }
}

// Total objects created: 2
// Object ID: 101, Count: 2
// Object ID: 102, Count: 2
// Hello from static nested class!