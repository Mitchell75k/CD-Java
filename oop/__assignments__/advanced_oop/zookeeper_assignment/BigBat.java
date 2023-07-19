package oop.__assignments__.advanced_oop.zookeeper_assignment;

public class BigBat extends Mammal {
    public BigBat(){
        this.energyLevel = 300; //every bigbat has an energy level of 300 when it is instantiated
    }
    public void fly() {
        this.energyLevel -= 25;
        System.out.println("\nThe mysterious beast flies!\n Energy level: " + this.energyLevel);
    }
    public void eatHumans(){ 
        this.energyLevel += 25;
        System.out.println("\nThe beast is swallowing humans whole!\n Energy level: " + this.energyLevel);
    }
    public void attackTown(){
        this.energyLevel -= 100;
        System.out.println("\nThe beast turns to the city to unleash its rage!\n Energy level: " + this.energyLevel);
    }

}
