package oop.__assignments__.advanced_oop.devices_p_assignment;

public class PhoneTest {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone");
        System.out.println("\nPhone Type: " + iPhone.getPhoneType());
        System.out.println("Battery Percentage: " + iPhone.getBatteryPercentage() + "%"); //battery percentage is set to 100 when the phone is instantiated even though we did not set it in the constructor
                                                                                        //this is because the Device class batteryPercentage attribute is set to 100 by default, without us having to set it in the constructor and instantiate it
    //make 3 calls, play 1 game, and charge the phone
    iPhone.makeCall();
    iPhone.makeCall();
    iPhone.makeCall(); //battery percentage should be 85% after 3 calls
    System.out.println("\nBattery Percentage: " + iPhone.getBatteryPercentage() + "%");

    iPhone.playGame("Call of Duty"); 
    iPhone.playGame("Angry Birds");
    iPhone.playGame("Pokemon Go");//battery percentage should be 25% after 3 games (decreased by 20% each time)

    //testing critical battery message
    iPhone.playGame("Fortnite"); //battery percentage should be 5% after 4 games (decreased by 20% each time)
    iPhone.makeCall(); // battery message should be displayed

    iPhone.chargePhone(); //battery percentage should be 95% after charging the phone (increased by 50%)
    }
}
