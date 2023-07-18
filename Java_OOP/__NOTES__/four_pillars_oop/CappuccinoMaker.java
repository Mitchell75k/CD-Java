package Java_OOP.__NOTES__.four_pillars_oop;


//this file is used to demonstrate inheritance, and inheritance, in Java classes
//inheritance is the process of creating a new class from an existing class, and using the existing parent class's attributes and methods in the new subclass
//the new subclass can also have its own attributes and methods that are unique to it
//the new subclass can also override the parent class's methods with its own version of the method


public class CappuccinoMaker extends CoffeeMaker { //here we are creating a new subclass called CappuccinoMaker that inherits from the CoffeeMaker class
                                                  //since its a subclass, it needs to also have the parent class's constructor, which is why we are passing in the maxVolumeOz parameter and calling the parent class's constructor

    public CappuccinoMaker(int maxVolumeOz) { //constructor
        super(maxVolumeOz); //here we are calling the parent class's constructor and passing in the maxVolumeOz parameter. This will set the maxVolumeOz attribute for every instance of the CappuccinoMaker class 
        this.milk = "whole"; //setting the milk attribute to "whole" for every instance of the CappuccinoMaker class
    }
    
    public void makeCappuccino(String beans) { 
        super.brew(beans);              //here we are calling the parent class's brew() method and passing in beans as the parameter
        System.out.println("Smooth.");//here we are overriding the parent class's brew() method with our own version of the method (polymorphism)
        
        //the output of this method will be: "Brewing coffee" and then "Smooth."
    }

    // -----------------------------EXAMPLE OF POLYMORPHISM--------------------------------
    public void clean() {                                 //here we are overriding the parent class's clean() method with our own version of the method
        System.out.println("Cleaning cappuccino maker");

        //the output of this method will be: "Cleaning cappuccino maker", and since we are not super.clean() method, the parent class's clean() method will not be called like it was in the makeCappuccino() method
    }
}
