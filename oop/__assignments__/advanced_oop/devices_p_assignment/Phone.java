package oop.__assignments__.advanced_oop.devices_p_assignment;

public class Phone extends Device {
    private String phoneType;

    //constructor
    public Phone(String phoneType) { //constructor that allows the user to set the phone type when the phone is instantiated (iPhone, Android, etc.)
        this.phoneType = phoneType;
    }

    //getter for the phone type
    public String getPhoneType() {
        return this.phoneType; 
    }

    //method to make a call
    public void makeCall() {
        if (this.batteryPercentage <=5) {
            System.out.println("\nBattery is critically low! Please charge your phone!");
            return; //returning out of the method if the battery percentage is less than 5%
        }
        this.batteryPercentage -=5; //decrementing the battery percentage by 5 every time the makeCall() method is called
        System.out.println("\nMaking a call :3 \nRemaining Battery: " + this.batteryPercentage + "%");
    }

    //method to play games
    public void playGame(String game) {
    if (this.batteryPercentage <=5) {
        System.out.println("\nBattery is critically low! Please charge your phone!");
        return;
    }
        this.batteryPercentage -=20; //decrementing the battery percentage by 20 every time the playGame() method is called
        System.out.println("\nPlaying: " + game + ": 'PEW PEW PEW' \nRemaining Battery: " + this.batteryPercentage + "%");
    }

    //method to charge the phone
    public void chargePhone() {
        if (this.batteryPercentage <=5) {
            System.out.println("\nTHANK GOD! I thought I was going to die!");
            this.batteryPercentage += 50; //incrementing the battery percentage by 50 every time the chargePhone() method is called
            System.out.println("\nCharging phone... \nRemaining Battery: " + this.batteryPercentage + "%");
        }
        else {
            System.out.println("\nCharging phone... \nRemaining Battery: " + this.batteryPercentage + "%");
        }
    }
}
