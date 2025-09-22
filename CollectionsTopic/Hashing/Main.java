package CollectionsTopic.Hashing;

class Person {
    String name;

    Person(String name) 
    {
        this.name = name;
    }

    // @Override
    // public boolean equals(Object obj) 
    // {
    //     ifk (this == obj) return true; // same reference
    //     if (obj == null || getClass() != obj.getClass()) return false;
    //     Person p = (Person) obj;
    //     return name.equals(p.name); // compare content
    // }

    @Override
    public int hashCode() 
    {
        return name.hashCode(); // hash based on content
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Person p1 = new Person("Jaya");
        Person p2 = new Person("Jaya");

        System.out.println(p1 == p2);          // false (different objects)
        System.out.println(p1.equals(p2));     // true (same content)
        System.out.println(p1.hashCode());     // same hash
        System.out.println(p2.hashCode());     // same hash
    }
}
// false
// true
// 2301599
// 2301599

// false
// false
// 2301599
// 2301599