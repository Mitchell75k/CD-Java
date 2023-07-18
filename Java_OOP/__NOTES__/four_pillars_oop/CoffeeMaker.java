package Java_OOP.__NOTES__.four_pillars_oop;
// we are using this file to demonstrate encapsulation in Java classes
// encapsulation is the process of hiding certain details and only showing the essential information to the user by using  access modifiers (public, private, protected, static)

public class CoffeeMaker {
    protected int maxVolumeOz; //protected means that this attribute can be accessed by any class that inherits from this class, but each variable is specific to the instance object of the class
    protected String milk; //protected vs private: protected can be accessed by any class that inherits from this class, private can only be accessed by the class itself
    
    public CoffeeMaker(int maxVolumeOz) { //constructor
        this.maxVolumeOz = maxVolumeOz; 
    }
                
    public int getMaxVolumeOz() {
        return this.maxVolumeOz;
    }
    
    public int getMaxServings() {
        return this.maxVolumeOz / 8;
    }
    
    public void brew(String beans) {
    System.out.println("Brewing coffee");
    }
    public void clean() {
        System.out.println("Cleaning coffee maker");
    }


}
