package Java_OOP.__notes__.oop_basics.getters_setters_access_mods_constructors;

//This file will be used to demonstrate the use of getters and setters, access modifiers, and constructor methods.

public class Vehicle {           //we should always set class attributes to private, and use getters and setters to access them. This helps us use the attributes in a more controlled way. 
    private int numberOfWheels; //private attributes can only be accessed within the class they are defined in. public attributes can be accessed anywhere, in any class in the project. 
    private String color; 

    //setter method
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels; //this sets the value of numberOfWheels
    }
    //setter
    public void setColor(String color) {//this sets the value of color
        this.color = color;             // the 'this' keyword is necessary here to specify that we are setting the value of the class attribute, not the parameter!!!!!
                                       // if we didn't use 'this', we would be setting the value of the parameter to itself, which would do nothing.
    }

    //getter 
    public int getNumberOfWheels() {
        return numberOfWheels; //this gets the value of numberOfWheels
    }
    //getter
    public String getColor() {
        return color; //this gets the value of color
    }

    // Instead of writing getters and setters manually in our test file, we could use overloaded constructor methods to set the values of our attributes when we create new instances of the class in our test file.

    public Vehicle () {                          //default constructor: sets the values if we don't pass any arguments when instantiating a new instance.
        this (4, "black"); //this is a way to call to the overloaded constructor method below using 'this'. It will set the values of our attributes to 4 and "black" when we instantiate a new instance. 
        //this.numberOfWheels = 4;
        //this.color = "black";                //These two lines are replaced by the line above. Faster and more efficient, but only for default values.
    }
    public Vehicle (int numberOfWheels) {
        this.numberOfWheels = numberOfWheels; //this is an overloaded constructor method. Its used when we pass an integer as an argument when creating a new instance of the class.
    
    }
    public Vehicle (String color) { //this overloaded method sets the color attribute if we only pass in a string argument when creating a new instance of the class.
        this.color = color;
        numberOfWheels = 4; //we can also set a default value of numberOfWheels here, since we are only setting the color attribute in this overloaded method.
    }

    public Vehicle (int numberOfWheels, String color) {
        this.numberOfWheels = numberOfWheels;
        this.color = color;     //this overloaded method sets both attributes if we pass in an integer and a string when creating a new instance of the class.
    }

}
