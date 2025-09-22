package EV2.BasicTopics;

class Car 
{
    String color; // field
    int speed;    // field

    void drive() 
    { // method
        System.out.println("The car is driving");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Car myCar = new Car(); // creating an object
        myCar.color = "Red";   // setting field value
        myCar.speed = 120;

        System.out.println("Color: " + myCar.color);
        myCar.drive(); // calling method
    }
}
// Color: Red
// The car is driving