package Java_OOP.__NOTES__.object_superclass;

//This file is used to demonstrate the use of the Object superclass.
//The Object superclass is the parent class of all classes in Java. It has a few methods that are inherited by all classes, such as .toString(), .equals(), and .getClass(), etc.
//To access these methods we have to use the 'this' keyword, which refers to the current instance of the class.

public class Person {
    private int age;
    private String name; 
    private static int numofppl=0; //static attribute to keep track of the number people objects we create. Its static because we want to keep track of the total number of people in the class itself, 
                                  //not the number of people in each instance of the class. Its also common practice to make this attribute private, and create a getter method to access it.
    public Person(int ageParam, String nameParam) { //constructor method
        this.age = ageParam;
        this.name = nameParam;
        numofppl++; //incrementing the static attribute every time we create a new instance of the class.
    }

    public void objectMethods(Person anotherObject) { //method to demonstrate the use of the Object superclass methods. It takes in another object as an argument and uses the 'this' keyword to access the methods.
        System.out.println("Class name: " + this.getClass().getSimpleName()); //.getsimpleName() is a method that returns the name of the class as a string. .getClass() returns the class of the object.
        System.out.println("toString: " + this.toString());                  //.toString() returns a string representation of the object. It is usually used to print the object.
        System.out.println("Equals: " + this.equals(anotherObject));        //.equals() compares two objects and returns a boolean value. It is usually used to compare two objects.
    }

    //getter method for the static attribute
    public static int getNumofppl() {
        return numofppl;
    }
}
