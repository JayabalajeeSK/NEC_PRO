package EV2.BasicTopics;

class Book 
{
    String title;
    String author;
    int year;

    // Constructor to set book details when created
    Book(String title, String bookAuthor, int year) 
    {
        this.title = title;
        author = bookAuthor;
        this.year = 1999;
    }

    void displayBook() 
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Published Year: " + year);
        System.out.println("----------------------------");
    }
}

public class ConstructorMain {
    public static void main(String[] args) {
        // Creating books using the constructor
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 1988);
        Book b2 = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 1999);

        // Display book details
        b1.displayBook();
        b2.displayBook();
    }
}

// Title: The Alchemist
// Author: Paulo Coelho
// Published Year: 1999
// ----------------------------
// Title: Wings of Fire
// Author: A.P.J. Abdul Kalam
// ----------------------------


class Animal 
{
    Animal() 
    {
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal 
{
    Dog() 
    {
        super(); // Calls Animal constructor first
        System.out.println("Dog constructor called");
    }
}

public class Main {
    public static void main(String[] args) 
    {
        Dog d = new Dog();
    }
}
// Animal constructor called
// Dog constructor called
enum Day { MONDAY, TUESDAY, WEDNESDAY }

public class Main 
{
    public static void main(String[] args) 
    {
        Day today = Day.MONDAY; // today is of type Day
        System.out.println(today);

        // Check datatype
        System.out.println(today.getClass().getName());
    }
}