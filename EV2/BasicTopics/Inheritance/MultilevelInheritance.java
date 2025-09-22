package EV2.BasicTopics.Inheritance;

// MultilevelInheritance.java
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

class Puppy extends Dog 
{
    void weep() 
    {
        System.out.println("Puppy is weeping.");
    }
}

public class MultilevelInheritance 
{
    public static void main(String[] args) 
    {
        Puppy p = new Puppy();
        p.eat();  // from Animal
        p.bark(); // from Dog
        p.weep(); // from Puppy
    }
}
// Animal is eating.
// Dog is barking.
// Puppy is weeping.