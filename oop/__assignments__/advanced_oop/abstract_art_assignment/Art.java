package oop.__assignments__.advanced_oop.abstract_art_assignment;

//this assignment demonstrates the use of abstract classes and abstract methods.-----------------------------------------------

//abstract classes are classes that cannot be instantiated. They are used as a template for other classes to extend from.
//abstract methods are methods that are declared but not implemented. They are implemented by subclasses of the abstract class.
//abstract methods can only be declared in abstract classes.
//abstract classes can have non-abstract methods.
//abstract classes can have member variables.
//abstract classes can have constructors, but they cannot be instantiated so they are only used by subclasses. But you can also just create a constructor in the subclass. 


public abstract class Art {
    //TODO: implement this class
    protected String title; //protected: only this class and its subclasses can access these variables, public: any class can access these variables, private: only this class can access these variables, 
    protected String author; //default: only classes in the same package can access these variables, static: this variable is shared by all instances of this class
    protected String description;

    //We could make a constructor here to super() to the subclasses, but we don't need to because we are not instantiating this class and it'd be easier to just make a constructor in the subclasses.


    //abstract method: viewArt()
    public abstract void viewArt(); //abstract methods are methods that are declared but not implemented. They are implemented by subclasses of this class.
                                   //they can be called by subclasses of this class. 
}
