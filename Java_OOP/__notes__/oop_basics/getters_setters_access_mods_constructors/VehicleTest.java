package Java_OOP.__notes__.oop_basics.getters_setters_access_mods_constructors;

public class VehicleTest {
    public static void main(String[] args) {
    //creating new instances of the Vehicle class called bike and car, they will have a default value of 4 wheels and black color from our default constructor method.
        Vehicle bike = new Vehicle(); 
        Vehicle car = new Vehicle();

        bike.setNumberOfWheels(2); //setting attribute values for our 'bike' object
        bike.setColor("red");

        int bikeWheels = bike.getNumberOfWheels(); //getting wheel attribute value from our 'bike' object, setting it to variable: 'bikeWheels'
        String bikeColor = bike.getColor();       //getting color attribute value from our 'bike' object, setting it to variable: 'bikeColor'

        car.setNumberOfWheels(4); //setting wheel & color attribute values for our 'car' object
        car.setColor("green"); 

        int carWheels = car.getNumberOfWheels(); //getting wheel & color attributes from our 'car' object, setting it to variable: 'carWheels' & 'carColor'
        String carColor = car.getColor();

        System.out.println("\nBike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
        System.out.println("\nCar object - Wheels: " + carWheels + ", Color: " + carColor);
    
    
        //-----------creating new objects using overloaded constructor methods-------------------
        Vehicle truck =new Vehicle (6, "blue"); //now when we call the constructor method, we can pass in arguments to set the values of our attributes.
        int truckWheels = truck.getNumberOfWheels();                //temporary variables to store the values of our attributes
        String truckColor = truck.getColor();
        System.out.println("\nTruck object - Wheels: " + truckWheels + ", Color: " + truckColor);

        Vehicle busVehicle = new Vehicle (); //this will use the default constructor method, which sets the values of our attributes to 4 and "black"
        int busWheels = busVehicle.getNumberOfWheels();
        String busColor = busVehicle.getColor();
        System.out.println("\nBus object - Wheels: " + busWheels + ", Color: " + busColor);
    }
}
