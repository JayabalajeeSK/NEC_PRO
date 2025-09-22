package EV2.BasicTopics.Inheritance;

// HybridInheritance.java
interface Animal 
{
    void eat();
}

interface Pet 
{
    void play();
}

class Dog implements Animal 
{
    public void eat() 
    {
        System.out.println("Dog is eating.");
    }
}

class Puppy extends Dog implements Pet 
{
    public void play() 
    {
        System.out.println("Puppy is playing.");
    }
}

public class HybridInheritance 
{
    public static void main(String[] args) 
    {
        Puppy p = new Puppy();
        p.eat();  // from Dog (Animal)
        p.play(); // from Pet
    }
}
// Dog is eating.
// Puppy is playing.