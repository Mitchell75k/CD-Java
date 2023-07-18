package oop.__assignments__.advanced_oop.devices_p_assignment;

public class Device {
    protected int batteryPercentage = 100; //protected means that this attribute can be accessed by any class that inherits from this class, but each variable is specific to the instance object of the class
                                          //batteryPercentage is set to 100 when the device is instantiated
    
    //we do not need a constructor for this class because we are not setting any attributes in the constructor, instead we are setting the attributes in the subclasses' constructors 

    //getter for the battery percentage
    public int getBatteryPercentage() {
        return this.batteryPercentage;
    }
}
