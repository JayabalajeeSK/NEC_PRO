package EV2.BasicTopics.Inheritance;

// MultipleInheritance.java
interface Animal 
{
    void eat();
}

interface Pet 
{
    void play();
}

class Dog implements Animal, Pet 
{
    public void eat() 
    {
        System.out.println("Dog is eating.");
    }
    public void play() 
    {
        System.out.println("Dog is playing.");
    }
}

public class MultipleInheritance 
{
    public static void main(String[] args) 
    {
        Dog d = new Dog();
        d.eat();
        d.play();
    }
}
// Dog is eating.
// Dog is playing.