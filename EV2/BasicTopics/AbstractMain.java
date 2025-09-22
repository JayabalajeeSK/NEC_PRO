package EV2.BasicTopics;

abstract class Animal 
{

    abstract void sound(); // abstract method

    void sleep() 
    {         // normal method
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal 
{
    void sound() 
    { // must implement
        System.out.println("Bark");
    }
}

public class AbstractMain 
{
    public static void main(String[] args) 
    {
        // Animal a = new Animal(); ❌ Not allowed
        Animal dog = new Dog();
        dog.sound(); // Bark
        dog.sleep(); // Sleeping...
    }
}
// Bark
// Sleeping...
