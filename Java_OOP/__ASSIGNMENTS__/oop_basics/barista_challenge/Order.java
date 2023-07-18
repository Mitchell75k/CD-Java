package Java_OOP.__assignments__.oop_basics.barista_challenge;
import java.util.ArrayList;

public class Order {
    private String name; //we'll need these attributes to be private so that we can use getters and setters
    private boolean ready; 
    private ArrayList <Item> items; //<Item> refers to the Item class
    //we are creating an instance of the ArrayList class to store Items

    public Order () { //constructor
        this.name = "Guest";
        this.items = new ArrayList<Item>();
        this.ready = false;
    }
    public Order (String name) { //overloaded constructor
        this.name = name;
        this.items = new ArrayList<Item>();
        this.ready = false;
    }
    //----------------setters and getters--------------------
    public String getName() { //getter
    return name;
    }
    public boolean isReady() { //getter
        return ready;
    }
    public ArrayList<Item> getItems() { //getter
        return items;
    }
    public void setName(String name) { //setter
        this.name = name;
    }
    public void setReady(boolean ready) { //setter
        this.ready = ready;
    }
    public void  setItems(ArrayList<Item> items) { //setter
        this.items = items;
    }

    //-----------------methods--------------------
    public void additem(Item item) {
        this.items.add(item);
    }
    public String getStatusMessage() {
        if (this.ready == true) {
            return "\nYour order is ready! Thank you for waiting! :3";
        }
        else {
            return "\nYour order will be ready soon! Thank you for waiting! :3";
        }
    }
    public double getOrderTotal() {
        double total = 0.0;
        for (Item item : this.items) { //looping through the items in the order
            total += item.getPrice(); //adding the price of each item to the total using a getter from the Item class
        }
        return total;
    }
    public void displayOrder() {
        System.out.println("\nOrder for: " + this.name);
        System.out.println("Items:----------------");
        for (Item item: this.items) {
            System.out.println(item.getName() + " - $" + item.getPrice()); //using getters from the Item class
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}
