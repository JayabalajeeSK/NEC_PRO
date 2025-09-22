package EV2.BasicTopics;

// Define interface
interface Animal 
{
    void eat(); // abstract method
    void sleep(); // abstract method
}

// Implementing class
class Dog implements Animal 
{
    public void eat() 
    {
        System.out.println("Dog eats bones.");
    }
    public void sleep() 
    {
        System.out.println("Dog sleeps in the kennel.");
    }
}

// Main class
public class InterfaceExample 
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.eat();
        d.sleep();
    }
}
// Dog eats bones.
// Dog sleeps in the kennel.