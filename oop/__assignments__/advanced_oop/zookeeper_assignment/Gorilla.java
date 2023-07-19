package oop.__assignments__.advanced_oop.zookeeper_assignment;

public class Gorilla extends Mammal {
    
    //method for throwing something
    public void throwSomething() {
        System.out.println("\nHarambe has thrown something at zoo guests! and it looks brown.... Uh-oh...");
        this.energyLevel -= 5;
        System.out.println("\nEnergy level: " + this.energyLevel);
    }
    //method for eating bananas
    public void eatBananas() {
        System.out.println("\nHarambe rubs his belly in satisfaction after eating a banana");
        this.energyLevel += 10;
        System.out.println("\nEnergy level: " + this.energyLevel);
    }
    //method for climbing
    public void climbTrees(){
        this.energyLevel -= 10;
        System.out.println("\nHarambe swings through the branches before finding a nice spot to rest in the tree");
        System.out.println("\nEnergy level: " + this.energyLevel);
    }
}
