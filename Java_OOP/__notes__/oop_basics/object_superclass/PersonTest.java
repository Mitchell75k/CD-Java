package Java_OOP.__notes__.oop_basics.object_superclass;

public class PersonTest {
    public static void main(String[] args) {
        //creating two new instances of the Person class & setting their attributes using the constructor method.
        Person person1 = new Person(10, "Nick"); 
        Person person2 = new Person(5, "Ravi");
        Person person3 = new Person(15, "Ben");
        //calling the objectMethods method on our person1 object, passing in our person2 object as an argument.
        person1.objectMethods(person2); //we use person1 as the object to call the method on, and person2 as the argument to pass in.
        //calling the getNumofppl method on the Person class to get the value of the static attribute.
        System.out.println("Number of people: " + Person.getNumofppl());
    }
}
