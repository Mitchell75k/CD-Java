package oop.__assignments__.advanced_oop.zookeeper_assignment;

public class Mammal {
    protected int energyLevel = 100; //every mammal has an energy level of 100 when it is instantiated, unless otherwise specified in the constructor

    //getter for the energy level
    public int getEnergyLevel() {
        return this.energyLevel;
    }
}
