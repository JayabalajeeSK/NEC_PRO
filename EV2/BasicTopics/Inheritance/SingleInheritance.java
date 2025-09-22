package EV2.BasicTopics.Inheritance;

// SingleInheritance.java
class Animal 
{
    void eat() 
    {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal 
{
    void bark() 
    {
        System.out.println("Dog is barking.");
    }
}

public class SingleInheritance 
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.eat();  // Inherited
        d.bark(); // Own method
    }
}
// Animal is eating.
// Dog is barking.