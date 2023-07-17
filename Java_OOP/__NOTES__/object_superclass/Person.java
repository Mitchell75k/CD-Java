package Java_OOP.__NOTES__.object_superclass;

//This file is used to demonstrate the use of the Object superclass.
//The Object superclass is the parent class of all classes in Java. It has a few methods that are inherited by all classes, such as .toString(), .equals(), and .getClass(), etc.
//To access these methods we have to use the 'this' keyword, which refers to the current instance of the class.

public class Person {
    private int age;
    private String name; 
    
    public Person(int ageParam, String nameParam) { //constructor method
        this.age = ageParam;
        this.name = nameParam;
    }

    public void objectMethods(Person anotherObject) { //method to demonstrate the use of the Object superclass methods. It takes in another object as an argument and uses the 'this' keyword to access the methods.
        System.out.println("Class name: " + this.getClass().getSimpleName()); //.getsimpleName() is a method that returns the name of the class as a string. .getClass() returns the class of the object.
        System.out.println("toString: " + this.toString());                  //.toString() returns a string representation of the object. It is usually used to print the object.
        System.out.println("Equals: " + this.equals(anotherObject));        //.equals() compares two objects and returns a boolean value. It is usually used to compare two objects.
    }
}
