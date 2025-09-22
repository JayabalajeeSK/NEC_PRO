package EV2.BasicTopics;

class Animal 
{
    void sound() 
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal 
{
    void sound() 
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal 
{
    void sound() 
    {
        System.out.println("Cat meows");
    }
}

public class MOR_Main 
{
    public static void main(String[] args) 
    {
        Animal a;

        a = new Dog(); // Animal reference, Dog object
        a.sound();     // Output: Dog barks

        a = new Cat(); // Animal reference, Cat object
        a.sound();     // Output: Cat meows
    }
}
// Bark
// Cat meows
