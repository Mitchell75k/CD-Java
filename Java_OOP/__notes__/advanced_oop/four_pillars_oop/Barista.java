package Java_OOP.__notes__.advanced_oop.four_pillars_oop;

//this file is used to demonstrate abstraction in Java classes
//abstraction is the process of hiding certain details and only showing the essential information to the user by using  access modifiers (public, private, protected, static)
//In this case, we are hiding the details of the CoffeeMaker class from the Barista class by using the private access modifier 

public class Barista {
    private String name; //just the name of the barista
    private CoffeeMaker coffeeMaker; //here we are creating an instance of the CoffeeMaker class called coffeeMaker. This is COMPOSITION, where we are using an instance of another class as an attribute in this class
                                    // this allows us to use the methods and attributes of the CoffeeMaker class in the Barista class without having to inherit from the CoffeeMaker class
                                   //this is also an example of abstraction, where we are hiding the details of the CoffeeMaker class from the Barista class by using the private access modifier
    
    public Barista(String name) { //constructor for the Barista class
        this.name = name;
        this.coffeeMaker = new CoffeeMaker(40); //here we are creating a new instance of the CoffeeMaker class and passing in 40 as the maxVolumeOz parameter 
                                                           //so that the maxVolumeOz attribute is set to 40 for every instance of the CoffeeMaker class
    }
    
    public void makeCoffee() { //example of abstraction
        this.coffeeMaker.brew("Zoka");//here we are calling the brew() method from the CoffeeMaker class and passing in "Zoka" as the beans parameter
                                           //again, this is all possible because we are using an instance of the CoffeeMaker class as an attribute in the Barista class (COMPOSITION)
    } 
    public void cleanCoffeeMaker() { //example of abstraction
        this.coffeeMaker.clean(); //here we are calling the clean() method from the CoffeeMaker class
    }
    public void makeCappuccino() { //example of abstraction
        CappuccinoMaker cappuccinoMaker = new CappuccinoMaker(40); // we are creating a new instance of the CappuccinoMaker subclass and passing in 40 as the parameter.
        // We could also create this instance as an attribute of the Barista class, but we don't need to because we are only using it once in this method, whereas we use the coffeeMaker attribute in multiple methods (makeCoffee() and cleanCoffeeMaker())

        cappuccinoMaker.makeCappuccino("Zoka"); //here we are calling the makeCappuccino() method from the CappuccinoMaker class and passing in "Zoka" as the beans parameter
    }
    //setter for the name attribute so that we can get rid of the squigglies
    public void setName(String name) { //now we can change our barista's name attribute in our hypothetical test file
        this.name = name;
    }
}
